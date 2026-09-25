public class Main {

    static void executeCommand(String command) {
        if (command.equals("start")) {
            System.out.println("Nasaq starting...");
        } else if (command.equals("status")) {
            System.out.println("Status: healthy");
        } else {
            System.out.println("Unknown command: " + command);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String command = args[0];
            executeCommand(command);
        } else {
            System.out.println("Nasaq expects at least one argument");
        }
    }
}
