import oui.*;

public class Client {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide the base directory as a command-line argument.");
            return;
        }

        try {
            DataManager.basedir = args[0];
            App app = new App();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
