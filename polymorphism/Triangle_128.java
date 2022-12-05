package anisulislam.polymorphism;

public class Triangle_128 extends Shape_128{

    double base, height;

    Triangle_128( double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5*base*height;

    }
}
