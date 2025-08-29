package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape obj1 = factory.getShape("Square");

        obj1.draw();

    }
}
