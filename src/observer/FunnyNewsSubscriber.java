package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/*
Subscriber that only displays news stories marked as "funny".
 */
public class FunnyNewsSubscriber implements Observer, NewsSubscriber {
    Observable observable;

    FunnyNewsSubscriber(Observable observable) {
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
        System.out.println("Funny news for the day:");
        ArrayList<NewsArticle> articles = (ArrayList<NewsArticle>) arg;
        articles.stream().filter(article -> article.getType() == NewsArticleType.FUNNY).forEach(article -> article.PrintNewsArticle());
    }
}
