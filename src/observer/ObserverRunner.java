package observer;

import java.util.Observer;

public class ObserverRunner {
    public static void main(String[] args) {
        // Setup observable and observers
        DailyNewsPublisher newsPublisher = new DailyNewsPublisher();
        NewsArticle article1 = new NewsArticle("Mary Sue", "Rocket to Mars!", "A rocket has arrived at Mars!", NewsArticleType.REGULAR);
        NewsArticle article2 = new NewsArticle("John Fax", "Hurricane strikes resort!", "Hurricane Zane strikes Florida!", NewsArticleType.BREAKING);
        NewsArticle article3 = new NewsArticle("Walter Applesauce", "Dog attacks cat with stick", "A pooch chased a cheshire cat with a wooden stick", NewsArticleType.FUNNY);
        NewsArticle article4 = new NewsArticle("Sara Mango", "Cow attacks hippo with hammer", "A cow hammered a hippo!", NewsArticleType.FUNNY);
        newsPublisher.AddArticle(article1);
        newsPublisher.AddArticle(article2);
        newsPublisher.AddArticle(article3);
        newsPublisher.AddArticle(article4);

        NewsSubscriber latestNewsSubscriber = new LatestNewsSubscriber(newsPublisher);
        NewsSubscriber allNewsSubscriber = new AllNewsSubscriber(newsPublisher);
        NewsSubscriber funnyNewsSubscriber = new FunnyNewsSubscriber(newsPublisher);

        // Push change from subject to observers
        newsPublisher.PublishArticles();

        System.out.println("\n________________________________________________\n");

        // Unsubscribe one observer, and simulate the next day by clearing the news feed for the news publisher
        newsPublisher.deleteObserver((Observer) allNewsSubscriber);
        newsPublisher.ClearArticlesForTheDay();

        NewsArticle article5 = new NewsArticle("Julie Waterbottle", "Happy Feet", "Penguin visits man's apartment", NewsArticleType.FUNNY);
        NewsArticle article6 = new NewsArticle("Joe Plum", "Government shutdown", "Lawmakers threaten to leave if no eco-deal", NewsArticleType.BREAKING);
        newsPublisher.AddArticle(article5);
        newsPublisher.AddArticle(article6);

        // Push again from subject to observers
        newsPublisher.PublishArticles();
    }
}
