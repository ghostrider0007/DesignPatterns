package DecoraterPattern;



public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraPanner(new ExtraCheese(new VegDelight()));

        System.out.println(pizza.cost());



    }
}
