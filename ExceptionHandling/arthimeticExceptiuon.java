package ExceptionHandling;

public class arthimeticExceptiuon {
    static int division(int a, int b){
        try{
            if(b == 0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Caught an exception: " + e.getMessage());
            return 0; 
        }
        finally{
            System.out.println("This block will always execute, regardless of exceptions.");
        }
    }
    public static void main(String args[]){
        int a = 10;
        int b = 2;
        int result = division(a, b);
        System.out.println("Result: " + result);
    }
}
