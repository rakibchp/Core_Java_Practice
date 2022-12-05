package anisulislam.examPrac;

public class LoopTest {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%5==0 && i%3==0){
                System.out.println("Football");
            } else if (i%5==0) {
                System.out.println("Ball");

            } else if (i%3==0) {
                System.out.println("Foot");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
