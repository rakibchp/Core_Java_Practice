package anisulislam.factorial;

public class Factorial_105 {

    int Factorial(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*Factorial(n-1);
        }
    }
}
