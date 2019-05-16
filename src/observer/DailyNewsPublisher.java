package observer;

import java.util.ArrayList;
import java.util.Observable;

/*
Simulating an object that publishes a news feed every day.
 */
public class DailyNewsPublisher extends Observable {
    private ArrayList<NewsArticle> dailyNewsArticles = new ArrayList<>();

    public DailyNewsPublisher() {}

    public void AddArticle(NewsArticle newsArticle) {
        dailyNewsArticles.add(newsArticle);
    }

    public void PublishArticles() {
        setChanged();
        notifyObservers(dailyNewsArticles);
    }

    public void ClearArticlesForTheDay() {
        dailyNewsArticles.clear();
    }
}
