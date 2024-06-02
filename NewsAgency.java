public class NewsAgency extends Subject {
    private String news;

    public String getNews(){
        return news;
    }

    public void setNews(String news){
        this.news = news;
        notifyObservers(news);
    }


}
