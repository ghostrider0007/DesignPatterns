package withStrategy;

import withoutStrategy.PaymentType;

public class UPIPaymentStrategy implements PaymentStrategy{
    public void payMoney(double amount)
    {
        System.out.println("Processing PayPal payment of amount " + amount);
    }
}
