package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape obj = factory.getShape("Square");

        obj.draw();

    }
}
