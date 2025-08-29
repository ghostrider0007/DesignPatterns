package ObeseverPattern.Observer;

import ObeseverPattern.Observable.StocksObserable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObserable obserable;

    public EmailAlertObserverImpl(String emailId, StocksObserable obserable) {
        this.emailId = emailId;
        this.obserable = obserable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("mail sent to:"+ emailId);
    }
}
