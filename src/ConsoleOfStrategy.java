import java.util.Scanner;

public class ConsoleOfStrategy implements IOStage{

    private Scanner keyboard = new Scanner(System.in);
    @Override
    public String inputString() {
        return keyboard.nextLine();
    }

    @Override
    public void outputLine(String line) {
        System.out.println(line);
    }
}


