package anisulislam.polymorphism;

public class Rectangle_128 extends Shape_128 {

    double length, width;

    Rectangle_128(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }
}
