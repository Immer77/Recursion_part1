package opgave1_recursion;

public class FactorialAssignment {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    /**
     * Calculates Factorial of n
     * @param n
     * @return
     */
    private static int factorial(int n) {
        int result = 0;
        if(n == 1){
            result = 1;
        }
        else{
            result = n * factorial(n-1);
        }
        return result;
    }
}
