package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileObserver implements NotificationAlert{
    String mobileNumber;
    StockObservable stockObservable;

    public MobileObserver(String mobileNumber, StockObservable stockObservable){
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsg(mobileNumber);
    }

    private void sendMsg(String mobileNumber) {
        System.out.println("Msg sent to: " + mobileNumber);
    }
}
