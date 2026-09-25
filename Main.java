public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("start")) {
                System.out.println("Nasaq starting...");
            } else if (args[0].equals("status")) {
                System.out.println("Status: healthy");
            } else {
                System.out.println("Unknown command: " + args[0]);
            }
        } else {
            System.out.println("Nasaq expects at least one argument");
        }
    }
}
