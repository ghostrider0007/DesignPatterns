package ObeseverPattern;

import ObeseverPattern.Observable.IphoneObservableImpl;
import ObeseverPattern.Observable.StocksObserable;
import ObeseverPattern.Observer.EmailAlertObserverImpl;
import ObeseverPattern.Observer.MobileAlertObserverImpl;
import ObeseverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObserable observable = new IphoneObservableImpl();


        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("9999999999", observable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("123344444", observable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("raj@email.com",observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);


        observable.setStockCount(10);
        observable.setStockCount(-10);
        observable.setStockCount(10);
    }

}
