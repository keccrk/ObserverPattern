public class SMSObserver implements Observer {
    private String phoneNumber;

    public SMSObserver(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message){
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }
}
