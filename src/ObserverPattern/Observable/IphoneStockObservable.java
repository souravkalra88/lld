package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    public List<NotificationAlert> observerList = new ArrayList<>();
    public int stock = 0;

    @Override
    public void add(NotificationAlert observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlert observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlert observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stock == 0) {
            notifySubscribers();
        }
        stock += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stock;
    }
}

