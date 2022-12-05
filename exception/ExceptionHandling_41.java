package anisulislam.exception;

public class ExceptionHandling_41 {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x/y;

            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception : "+e);
        }

        finally {
            System.out.println("Last line: Test for Rakib's codes");

        }


    }

}
