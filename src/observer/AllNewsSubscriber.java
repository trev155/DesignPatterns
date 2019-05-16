package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/*
Subscriber that displays all news stories for each day.
 */
public class AllNewsSubscriber implements Observer, NewsSubscriber {
    Observable observable;

    AllNewsSubscriber(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DailyNewsPublisher) {
            displayNews(arg);
        }
    }

    @Override
    public void displayNews(Object arg) {
        System.out.println("____________________");
        System.out.println("All news for the day:");
        ArrayList<NewsArticle> articles = (ArrayList<NewsArticle>) arg;
        articles.forEach(article -> article.PrintNewsArticle());
    }
}
