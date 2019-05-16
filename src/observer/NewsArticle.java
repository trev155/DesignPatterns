package observer;

/*
An object representing a single news article / item / report.
 */
public class NewsArticle {
    private String author;
    private String headline;
    private String content;
    private NewsArticleType type;

    public NewsArticle(String author, String headline, String content, NewsArticleType type) {
        this.author = author;
        this.headline = headline;
        this.content = content;
        this.type = type;
    }

    // to be called by observers
    public void PrintNewsArticle() {
        System.out.println("----------");
        System.out.println(headline + " (By: " + author + ")\n");
        System.out.println(content);
    }

    public NewsArticleType getType() {
        return this.type;
    }
}
