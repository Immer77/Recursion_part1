package opgave6_recursion;

import java.io.PrintWriter;

public class dominoBrikker {
    public static void main(String[] args) {
        System.out.println(boardCover(5));
    }

    public static int boardCover(int n){
        int result = 0;
        if(n == 1){
            result = 1;
        }else if(n == 2){
            result = 2;
        }else{
            result = boardCover(n-1) + boardCover(n-2);
        }

        return result;
    }

}
