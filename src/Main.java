import withStrategy.PaymentManagerSt;
import withStrategy.PaymentStrategy;
import withStrategy.UPIPaymentStrategy;
import withoutStrategy.PaymentManager;
import withoutStrategy.PaymentType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentManager paymentManager = new PaymentManager();

        // want to pay using credit card or UPI
//        paymentManager.setPaymentType(PaymentType.UPI);
//        paymentManager.payMoney(2601.00);

        // with strategy pattern

        PaymentManagerSt paymentManagerSt = new PaymentManagerSt();

        paymentManagerSt.setPaymentStrategy(new UPIPaymentStrategy());

        paymentManagerSt.payMoney(1000.00);
    }
}