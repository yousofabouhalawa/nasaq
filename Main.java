import java.util.List;
import java.util.ArrayList;

public class Main {

    static Article findArticleById(List<Article> articles, long articleId) {
        for (Article article : articles) {
            if (article.getId() == articleId) {
                return article;
            }
        }
        return null;
    }

    static List<Article> createArticles() {
        List<Article> articles = new ArrayList<>();
        Article article1 = new Article(100, "Article 1 Title", "Article 1 body");
        Article article2 = new Article(101, "Article 2 Title", "Article 2 body");
        Article article3 = new Article(102, "Article 3 Title", "Article 3 body");
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        return articles;
    }

    static void executeCommand(String[] args) {
        String command = args[0];
        if (command.equals("start")) {
            System.out.println("Nasaq starting...");
            List<Article> articles = createArticles();
            System.out.println("Number of articles: " + articles.size());

            for (Article article : articles) {
                System.out.println("Article " + article.getId() + " title: " + article.getTitle());
            }

        } else if (command.equals("status")) {
            System.out.println("Status: healthy");
        } else if (command.equals("find")) {

            if (args.length < 2) {
                System.out.println("find requires an article ID");
                return;
            }

            List<Article> articles = createArticles();
            try {
                long targetArticleId = Long.parseLong(args[1]);
                Article foundArticle = findArticleById(articles, targetArticleId);

                if (foundArticle != null) {
                    System.out.println("Found article title: " + foundArticle.getTitle());
                    System.out.println("Article published: " + foundArticle.isPublished());
                } else {
                    System.out.println("Article not found");
                }
            } catch (NumberFormatException exception) {
                System.out.println("ID must be a number");
            }

        } else if (command.equals("publish")) {

            if (args.length < 2) {
                System.out.println("publish requires an article ID");
                return;
            }

            List<Article> articles = createArticles();
            try {
                long targetArticleId = Long.parseLong(args[1]);
                Article foundArticle = findArticleById(articles, targetArticleId);

                if (foundArticle != null) {
                    System.out.println("Before publishing: " + foundArticle.isPublished());
                    foundArticle.publish();
                    System.out.println("After publishing: " + foundArticle.isPublished());
                } else {
                    System.out.println("Article not found");
                }
            } catch (NumberFormatException exception) {
                System.out.println("ID must be a number");
            }

        } else {
            System.out.println("Unknown command: " + command);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            executeCommand(args);
        } else {
            System.out.println("Nasaq expects at least one argument");
        }
    }
}
