package ObserverPattern;

import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailObserver;
import ObserverPattern.Observer.MobileObserver;
import ObserverPattern.Observer.NotificationAlert;

public class Store {
    public void observe() {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlert emailObserver = new EmailObserver("sk@gmail.com", iphoneStockObservable);
        NotificationAlert mobileObserver = new MobileObserver("4894811861", iphoneStockObservable);

        iphoneStockObservable.add(emailObserver);
        iphoneStockObservable.add(mobileObserver);

        iphoneStockObservable.setStockCount(100);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);
    }
}
