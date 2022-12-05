package anisulislam.abstractProblemSolving;

public class Test {
    public static void main(String[] args) {

        Shape shape;

        shape = new Rectangle(5,10);
        shape.area();

        shape = new Triangle(10, 15);
        shape.area();

        shape = new Circle(25);
        shape.area();
    }
}
