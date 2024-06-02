public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Observer emailObserver = new EmailObserver("kemal@gmail.com");
        Observer smsObserver = new SMSObserver("05597512368");

        newsAgency.attach(emailObserver);
        newsAgency.attach(smsObserver);

        newsAgency.setNews("Breaking News: Observer Pattern in Java!");

        newsAgency.detach(smsObserver);

        newsAgency.setNews("Another News: This project is a part of Design Patterns.");
    }
}