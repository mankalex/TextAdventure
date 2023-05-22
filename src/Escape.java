import org.junit.Test;

public class Escape {
    private static Escape end;
    private IOStage ioStage;
    private Escape(IOStage ioStage) {
        this.ioStage = ioStage;
    };

    public static Escape getInstance(IOStage ioStage) {
        if(end == null){
            end = new Escape(ioStage);
        }
        return end;
    }

    @Test
    public void getEscapeMessage() {
        ioStage.outputLine("\n\nYOU ESCAPED");
        System.exit(1);
    }
}
