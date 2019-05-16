package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/*
Displays the latest news story of the day.
 */
public class LatestNewsSubscriber implements Observer, NewsSubscriber {
    Observable observable;

    LatestNewsSubscriber(Observable observable) {
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
        System.out.println("The last news article for the day:");
        ArrayList<NewsArticle> articles = (ArrayList<NewsArticle>) arg;
        NewsArticle lastArticle = articles.get(articles.size() - 1);
        lastArticle.PrintNewsArticle();
    }
}
