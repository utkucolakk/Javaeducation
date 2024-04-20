package designPatterns.observer;

public class ObserverMain {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");

        newsAgency.register(cnn);
        newsAgency.register(bbc);

        newsAgency.setLatestNews("Breaking News: Observer Pattern in Action!!!");

        newsAgency.detach(cnn);

        newsAgency.setLatestNews("Another Breaking News: Observer Pattern in Action Updated!!!");



    }
}
