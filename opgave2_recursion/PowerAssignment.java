package opgave2_recursion;

public class PowerAssignment {
    public static void main(String[] args) {
        System.out.println(power(5,2));
        System.out.println(power2(5,2));
    }

    public static int power(int n, int p){
        int result = 0;
        if(Math.pow(n,p) == 1 || p == 0){
            result = 1;
        }else{
            result = power(n,p-1)*n;
        }
        return result;
    }

    public static int power2(int n, int p){
        int result = 0;
        if(Math.pow(n,p) == 1 || p == 0){
            result = 1;
        }else if(p % 2 != 0){
            result = power2(n,p-1)*n;
        }else{
            result = power2(n*n,p / 2);
        }
        return result;
    }
}
