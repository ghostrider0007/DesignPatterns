package DecoraterPattern;

public class ExtraPanner extends ToppingsDecorator{
    BasePizza pizza;

    public ExtraPanner(BasePizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int cost()
    {
        return pizza.cost()+100;
    }
}
