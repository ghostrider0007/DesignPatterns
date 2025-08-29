package withStrategy;

public class PaymentManagerSt {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payMoney(double amount)
    {
        paymentStrategy.payMoney(amount);
    }
}
