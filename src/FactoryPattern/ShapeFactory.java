package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String shape)
    {
        switch (shape) {
            case "Circle":
                return new Circle();

            case "Square":
                return new Square();
            default:
                return null; // testing2
        }
    }
}
