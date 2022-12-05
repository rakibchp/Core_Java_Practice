package anisulislam.factorial;

import java.util.Scanner;

public class Factorial_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fact =1;
        System.out.println("Enter any positive number : ");

        int input = scan.nextInt();

        for (int i=input; i>=1; i--){
            fact = fact*i;

        }

        System.out.println("Factorial of "+input+" is ="+fact);


    }
}
