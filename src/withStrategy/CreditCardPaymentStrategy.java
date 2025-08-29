package withStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    public void payMoney(double amount)
    {
        System.out.println("Processing PayPal payment of amount " + amount);
    }
}
