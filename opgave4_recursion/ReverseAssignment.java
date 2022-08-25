package opgave4_recursion;

public class ReverseAssignment {
    public static void main(String[] args) {
        System.out.println(reverse("RANSLIPRA"));
    }
    public static String reverse(String s){
        String answer = null;
        if(s.length() == 0){
            answer = "";
        }else {
            answer = s.charAt(s.length() -1) + reverse(s.substring(0,s.length() -1));
        }
        return answer;
    }
}
