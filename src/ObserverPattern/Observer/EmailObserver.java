package ObserverPattern.Observer;

import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.StockObservable;

public class EmailObserver implements NotificationAlert{
    String emailId;
    StockObservable stockObservable;

    public EmailObserver(String email, StockObservable stockObservable){
        this.emailId = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    private void sendEmail(String email) {
        System.out.println("Email sent to: " + email);
    }
}
