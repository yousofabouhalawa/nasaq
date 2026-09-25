public class Main {

    static void executeCommand(String command) {
        if (command.equals("start")) {
            System.out.println("Nasaq starting...");
            Article article = new Article("Article Title", "Article body");
            System.out.println("Article title: " + article.title + "\n" + "Article body: " + article.body + "\n" + "Is published: " + article.published);
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
