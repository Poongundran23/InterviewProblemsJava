package interviewProblems;

public class LengthOfAString {

    public static void main(String[] args){
        String s = "length";

        char[] c = s.toCharArray();

        int length=0;

        for (char ch : c){
           length++;
        }

        System.out.println(length);
    }
}
