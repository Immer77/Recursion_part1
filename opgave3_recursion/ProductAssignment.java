package opgave3_recursion;

public class ProductAssignment {
    public static void main(String[] args) {
        System.out.println(product(5, 5));
        System.out.println(productRus(6,4));
    }
    public static int product(int a, int b){
        int result = 0;
        if(a<1){
            result = 0;
        }else{
            result = product(a-1,b) + b;

        }
        System.out.println(result);
        return result;
    }

    public static int productRus(int a, int b){
        int result = 0;
        if(a == 0){
            result = 0;
        }else if (a % 2 == 1 && a>=1){
            result = productRus(a-1,b) + b;
        }else{
            result = productRus(a/2,2*b);
        }
        return result;
    }

}
