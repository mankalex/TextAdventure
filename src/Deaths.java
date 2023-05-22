import org.junit.Test;

public class Deaths {
    private static Deaths death;
    private IOStage ioStage;
    private Deaths(IOStage ioStage) {
        this.ioStage = ioStage;
    };

    public static Deaths getInstance(IOStage ioStage) {
        if(death == null){
            death = new Deaths(ioStage);
        }
        return death;
    }

    @Test
    public void getDeathMessage() {
        ioStage.outputLine("\n\nGAME OVER");
        System.exit(1);
    }
}
