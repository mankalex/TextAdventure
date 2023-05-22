public class Main {
    public static void main(String[] args) {
        IOStage ioStage = new ConsoleOfStrategy();
        UI ui = UI.getInstance(ioStage);

        ioStage.outputLine("DISCLAIMER : Type in lower case please :) \n");

        String answer = " ";
        answer = ui.getFirstInput();
        while (!answer.equals("go to house") && !answer.equals("run") && !answer.equals("run away")){
            ioStage.outputLine("That won't work right now (try going to house or running) \n");
            answer = ui.getFirstInput();
        }
        switch (answer){
            case "go to house" -> {}
            case "run", "run away" -> ui.firstDeath();
        }


        answer = ui.getSecondInput();
        while(!answer.equals("go upstairs") && !answer.equals("upstairs") && !answer.equals("kitchen") && !answer.equals("go to kitchen") && !answer.equals("go to basement") && !answer.equals("basement")){
            ioStage.outputLine("That won't work right now (try going to a location) \n");
            answer = ui.getSecondInput();
        }

        //upstairs route
        if(answer.equals("go upstairs") || answer.equals("upstairs"))
        {
            answer = ui.getUpstairsInput();
            while(!answer.equals("go to master bedroom") && !answer.equals("bedroom") && !answer.equals("bathroom") && !answer.equals("go to bathroom"))
            {
                ioStage.outputLine("That won't work right now (try inputting a location to go to) \n");
                answer = ui.getUpstairsInput();
            }

            //bathroom route
            if(answer.equals("bathroom") || answer.equals("go to bathroom"))
            {
                answer = ui.getBathroomInput();
                while(!answer.equals("go window") && !answer.equals("window") && !answer.equals("fight") && !answer.equals("nothing"))
                {
                    ioStage.outputLine("That won't work right now (theres a window nearby)\n");
                    answer = ui.getUpstairsInput();
                }

                // window ending
                if(answer.equals("go window") || answer.equals("window"))
                {
                    ui.getWindowEnding();
                }

                // fight death
                else if (answer.equals("fight")) {
                    ui.getFightDeath();
                }

                // do nothing death
                else {
                    ui.getNothingDeath();
                }
            }

            //bedroom route
            else{
                answer = ui.getBedroomInput();
                while(!answer.equals("bed") && !answer.equals("sleep") && !answer.equals("hide") && !answer.equals("closet") && !answer.equals("go to closet") && !answer.equals("hide in closet"))
                {
                    ioStage.outputLine("That won't work right now (input a location)");
                    answer = ui.getBedroomInput();
                }

                //sleep death
                if(answer.equals("bed") || answer.equals("sleep"))
                {
                    ui.getSleepDeath();
                }

                //closet ending
                else {
                    ui.getClosetEnding();
                }
            }
        }

        //kitchen route
        else if (answer.equals("go to kitchen") || answer.equals("kitchen")) {
            answer = ui.getKitchenInput();
            while(!answer.equals("cat") && !answer.equals("follow cat") && !answer.equals("follow black cat") && !answer.equals("black cat") && !answer.equals("living room") && !answer.equals("go living room") && !answer.equals("go to living room"))
            {
                ioStage.outputLine("That won't work right now (input a location)");
                answer = ui.getKitchenInput();
            }

            //living room route
            if(answer.equals("living room") || answer.equals("go living room") || answer.equals("go to living room"))
            {
                answer = ui.getLivingRoomInput();
                while(!answer.equals("run") && !answer.equals("run away") && !answer.equals("do nothing") && !answer.equals("nothing") && !answer.equals("vase") && !answer.equals("go to vase") && !answer.equals("throw vase"))
                {
                    ioStage.outputLine("That won't work right now (you spot a vase near you)");
                    answer = ui.getLivingRoomInput();
                }

                // run death
                if(answer.equals("run") || answer.equals("run away"))
                {
                    ui.getRunDeath2();
                }

                // nothing death
                else if (answer.equals("do nothing") || answer.equals("nothing"))
                {
                    ui.getNothingDeath2();
                }

                // vase throw ending
                else {
                    ui.getVaseThrowEnding();
                }
            }

            //black cat route
            else {
                answer = ui.getBlackCatInput();
                while(!answer.equals("slave") && !answer.equals("choose slave") && !answer.equals("death") && !answer.equals("choose death"))
                {
                    ioStage.outputLine("That won't work right now (choose an option)");
                    answer = ui.getBlackCatInput();
                }

                //slave death
                if(answer.equals("slave") || answer.equals("choose slave"))
                {
                    ui.getSlaveDeath();
                }

                //death death
                else{
                    ui.getDeathDeath();
                }

            }
        }

        //basement route
        else {
            answer = ui.getBasementInput();
            while(!answer.equals("run") && !answer.equals("run away") && !answer.equals("fight") && !answer.equals("hit") && !answer.equals("escape"))
            {
                ioStage.outputLine("That won't work right now (input a location)");
                answer = ui.getBasementInput();
            }

            //hit and run ending
            if(answer.equals("fight") || answer.equals("hit"))
            {
                ui.getHitAndRunEnding();
            }
            //escape death
            else {
                ui.getRunDeath();
            }
        }


    }
}