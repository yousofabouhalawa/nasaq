import java.util.List;
import java.util.ArrayList;

public class Main {

    static void executeCommand(String command) {
        if (command.equals("start")) {
            System.out.println("Nasaq starting...");
            List<Article> articles = new ArrayList<>();
            Article article1 = new Article("Article 1 Title", "Article 1 body");
            Article article2 = new Article("Article 2 Title", "Article 2 body");
            Article article3 = new Article("Article 3 Title", "Article 3 body");
            articles.add(article1);
            articles.add(article2);
            articles.add(article3);
            System.out.println(articles.size());

            int articleNumber = 1;
            for (Article article : articles) {
                System.out.println("Article " + articleNumber + " title: " + article.getTitle());
                articleNumber++;
            }
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
