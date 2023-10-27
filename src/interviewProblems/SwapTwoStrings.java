package interviewProblems;

public class SwapTwoStrings {

    public static void main(String[] args){
        String a = "hai";
        String b = "love";

        a = a + b;

        b = a.substring(0,a.length()-b.length());  // substring method will slice from starting to end-1 value
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);
    }
}
