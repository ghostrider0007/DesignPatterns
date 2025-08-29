package ObeseverPattern.Observer;

import ObeseverPattern.Observable.StocksObserable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String phoneNumber;
    StocksObserable obserable;

    public MobileAlertObserverImpl(String phoneNumber, StocksObserable obserable) {
        this.phoneNumber = phoneNumber;
        this.obserable = obserable;
    }

    @Override
    public void update() {
        sendSMS(phoneNumber, "");
    }

    private void sendSMS(String phoneNumber, String msg) {
        System.out.println("sms sent to:"+ phoneNumber);
    }
}
