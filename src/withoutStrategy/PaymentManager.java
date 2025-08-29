package withoutStrategy;

public class PaymentManager {
    private PaymentType paymentType;

    public void payMoney(double amount)
    {
        if (paymentType == PaymentType.CREDIT_CARD) {
            System.out.println("Processing credit card payment of amount " + amount);
        } else if (paymentType == PaymentType.DEBIT_CARD) {
            System.out.println("Processing debit card payment of amount " + amount);
        } else if (paymentType == PaymentType.PAYPAL) {
            System.out.println("Processing PayPal payment of amount " + amount);
        } else if (paymentType == PaymentType.UPI) {
            System.out.println("Processing PayPal payment of amount " + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

    public void setPaymentType(PaymentType paymentType)
    {
        this.paymentType = paymentType;
    }
}

