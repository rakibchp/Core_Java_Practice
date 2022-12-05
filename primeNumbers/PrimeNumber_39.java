package anisulislam.primeNumbers;

import java.util.Scanner;

public class PrimeNumber_39 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive number:  ");

        int count = 0;
        int input = scan.nextInt();

        for (int i=2; i<input; i++){

            if (input%i==0){
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println(input +" is a Prime Number");
        }
        else {
            System.out.println(input + " is not a Prime Number");
        }

    }
}
