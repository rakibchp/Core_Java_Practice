package anisulislam.primeNumbers;

import java.util.Scanner;

public class PrimeNumber_40 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count=0;
        int totalPrime=0;

        System.out.println("Enter initial number : ");
        int m = scan.nextInt();

        System.out.println("Enter closing number : ");
        int n = scan.nextInt();

        for (int i=m; i<=n; i++){

            for (int j=2; j<=i-1; j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i+" is prime number.");
                totalPrime++;
            }
            else {
                System.out.println("Not Prime");
            }
            count=0;

        }
        System.out.println("Total Number of Prime is : "+totalPrime);

    }
}
