public class Article {
    private long id;
    private String title;
    private String body;
    private boolean published;

    Article(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void publish() {
        this.published = true;
    }


    public long getId() {
        return id;
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
