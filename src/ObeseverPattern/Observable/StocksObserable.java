package ObeseverPattern.Observable;

import ObeseverPattern.Observer.NotificationAlertObserver;

public interface StocksObserable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStock);
    public int getStockCount();


}
