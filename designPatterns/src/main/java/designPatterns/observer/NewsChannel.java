package designPatterns.observer;

public class NewsChannel implements NewsObserver{
    private String channelName;

    public NewsChannel(String channelName){
        this.channelName = channelName;
    }

    @Override
    public void notify(String news) {
        System.out.println("News received by "+channelName+"---->"+news);
    }
}
