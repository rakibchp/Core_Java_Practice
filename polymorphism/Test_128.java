package anisulislam.polymorphism;

public class Test_128 {
    public static void main(String[] args) {
        Shape_128[] s = new Shape_128[3];
        s[0] = new Shape_128();
        s[1] = new Rectangle_128(3, 4);
        s[2] = new Triangle_128(5, 6);

        for (int i=0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
