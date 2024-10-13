package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlert;

public interface StockObservable {
    public void add (NotificationAlert Observer);

    public void remove(NotificationAlert Observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
