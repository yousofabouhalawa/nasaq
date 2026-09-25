public class Article {
    private String title;
    private String body;
    private boolean published;

    Article(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void publish() {
        this.published = true;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public boolean isPublished() {
        return published;
    }
}
