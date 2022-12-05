package anisulislam;

import java.util.Scanner;

public class Fibonacci_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type digit you prefer : ");

        int input = scan.nextInt();

        int first=0;
        int second=1;
        int fibo;
        System.out.print(first+ " "+second);

        for (int i=3; i<input; i++){
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;

        }




    }
}
