public class UI {
    private static UI ui;
    private IOStage ioStage;
    private UI(IOStage ioStage) {
        this.ioStage = ioStage;
    };
    Escape escape = Escape.getInstance(ioStage);
    Deaths death = Deaths.getInstance(ioStage);



    public static UI getInstance(IOStage ioStage) {
        if(ui == null){
            ui = new UI(ioStage);
        }
        return ui;
    }

    //First Inputs
    public String getFirstInput() {
        ioStage.outputLine("You are surrounded by a dense fog, once you come to there is a old house at the end of the road. \nYou need to take shelter from the rain. What do you do? ");
        return ioStage.inputString();
    }

    //Second Inputs
    public String getSecondInput() {
        ioStage.outputLine("Opening the creaky old wooden door of the house you are quickly washed over by the pungent odor of wet floorboards.\nYou feel someone watching you. May as well explore the house since you will be here until the storm calms down. \nShould you go upstairs, kitchen, or basement");
        return ioStage.inputString();
    }

    //Third Inputs
    public String getUpstairsInput() {
        ioStage.outputLine("Making your way up the stairs, each step making an eerie creek, on the final step you are overcome by a nauseating headache. \nYou can barely hear someone or something trying to speak to you ['I'm always watching you']. \nOnce you regain control, you can make out some doors you assume to be a bathroom or master bedroom. Which should you choose?");
        return ioStage.inputString();
    }

    public String getBasementInput() {
        ioStage.outputLine("Some inner thought told you to explore to basement, and explore you did. \nReaching the bottom of the stairs and turning on the lights you can see the full glory of this basement. It's crawling with spiders, cockroaches, \nliterally everything that you would expect to be in an abandoned house's basement. \nWith that exploration out of your system, you decide to go upstairs, but you can't move. You can feel a cold hand clutching at your leg. \nA voice says [Don't leave me here]. What do you do?");
        return ioStage.inputString();
    }
    public String getKitchenInput() {
        ioStage.outputLine("Stepping in the kitchen its covered in cobwebs. \nThere's a black cat that walks past you and rubs against you leg. \nThere's another room you believe to be the living room...");
        return ioStage.inputString();
    }


    //Fourth Inputs
    public String getBathroomInput() {
        ioStage.outputLine("Opening the door to the bathroom, you are met with a nest of cobwebs. \nPushing through it, its just a bathroom. A few seconds later, a wet slurping sound is coming from inside the tub. \nLooking inside, a dark wet liquid is coming from the drain, manifesting and growing by the second. \nIt's presence starts to freak you out...");
        return ioStage.inputString();
    }
    public String getBedroomInput() {
        ioStage.outputLine("You open the bedroom door. There is a queen sized bed. \nIt looks comfortable... other than the bed theres a closet.");
        return ioStage.inputString();
    }

    public String getBlackCatInput() {
        ioStage.outputLine("You follow the black cat. It leads you to an entertainment room. \nThere's a huge tv in the middle of the room. Once you enter, the tv turns on and plays static. \nAfter a few seconds, a dark figure appears on screen. It starts speaking to you, giving you two options. \n[You can either become my slave, or die where you stand]...");
        return ioStage.inputString();
    }

    public String getLivingRoomInput() {
        ioStage.outputLine("Inside the living room, you can see a fireplace that is somehow already lit. \nThe cat from earlier is on top of a chair. It transform into a humanoid creature. You get shivers down your spine... \nQuickly, before it fully transform, what do you do?");
        return ioStage.inputString();
    }


    //Endings
    public void getWindowEnding() {
        ioStage.outputLine("Breaking through the window, you bounce off the ground.\n You think you broke a few ribs but its fine. As long as you did not have to encounter whatever was awaiting you in the bathroom. \nThe storm seems to clear. As you start to walk away from the house, you hear a bloodcurdling scream...");
        escape.getEscapeMessage();
    }

    public void getClosetEnding() {
        ioStage.outputLine("You decide to hide in the closet and wait for morning. \nYou slowly drift to sleep. You hear the bedroom door open something through the night. \nYou wake up the next morning and get out the house. And make your way back home unscathed...");
        escape.getEscapeMessage();

    }
    public void getHitAndRunEnding() {
        ioStage.outputLine("You decide to punch the creature you can't see. \nIt takes a couple tries, with one of your swings you think you hit it's eye and it lets go. \nYou run outside and never look back. The storm seemed to clear and you find your way home.");
        escape.getEscapeMessage();
    }

    public void getVaseThrowEnding() {
        ioStage.outputLine("You notice the vase on the counter and throw it at the creature. \nThe creature shrieks. Now is your time to run. You dash out the front door and never look back. \nThe storm seems to clear and you find your way home...");
        escape.getEscapeMessage();
    }

    //Deaths

    public void firstDeath() {
        ioStage.outputLine("You ran away but soon got lost in a dense sea of fog. Never to be seen again...");
        death.getDeathMessage();
    }

    public void getFightDeath() {
        ioStage.outputLine("You've had enough of this house and storm. You wait for the creature to manifest and attempt to fight it. \nYou throw a straight right, but you hand gets stuck inside the creepy creature. \nSoon you find your entire body swallowed by the creature...");
        death.getDeathMessage();
    }

    public void getNothingDeath() {
        ioStage.outputLine("You wait for the creature to manifest because you could. It looks at you and smiles. \nYou feel nauseous and collapse. It appears curiosity killed the cat... ");
        death.getDeathMessage();
    }

    public void getSleepDeath() {
        ioStage.outputLine("Trying to sleep through the storm, you crawl into the neatly tucked in bed. \nYou hear a voice as you start to drift asleep saying [Thank you]... \nYou never woke up again... ");
        death.getDeathMessage();
    }

    public void getRunDeath() {
        ioStage.outputLine("Trying to escape the clutches of the creature only makes it worse. \nIt just quicksand, and you realize you're wasting energy. It crawls up your leg. Then arm. And stops near you neck. \nYou feel a sharp pain in the side of your neck and slowly drift asleep... you never wake up again...");
        death.getDeathMessage();
    }

    public void getRunDeath2() {
        ioStage.outputLine("Flight is usually the correct choice. You bolt out of the room, but the next room looks the exact same. \nYou try running out of the room again, but you are back in the living room again... \nIts an endless loop. There is no escape...");
        death.getDeathMessage();
    }

    public void getNothingDeath2() {
        ioStage.outputLine("You wait for the creature to transform. It smiles. \nA thick smog fills the room, you can't breathe. \nYou soon collapse on the ground and never recover...");
        death.getDeathMessage();
    }

    public void getSlaveDeath() {
        ioStage.outputLine("You chose to be a slave. You feel a sharp pain at your neck and collapse. \nYou become a slave for the rest of your life, doing work for the black market...");
        death.getDeathMessage();
    }

    public void getDeathDeath() {
        ioStage.outputLine("You chose to be dead over a slave. Good morals. However, it doesn't save you from dying...");
        death.getDeathMessage();
    }
}
