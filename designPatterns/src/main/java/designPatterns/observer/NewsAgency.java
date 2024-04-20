package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject{

    private List<NewsObserver> newsObservers = new ArrayList<>();
    private String latestNews;

    @Override
    public void register(NewsObserver newsObserver) {
        newsObservers.add(newsObserver);
    }

    @Override
    public void detach(NewsObserver newsObserver) {
        newsObservers.remove(newsObserver);
    }


    public void setLatestNews(String news){
        this.latestNews = news;
        notify(news);
    }


    @Override
    public void notify(String news) {
        newsObservers.forEach(observer-> observer.notify(news));
    }
}
