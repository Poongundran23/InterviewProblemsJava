package interviewProblems;

public class ReverseStringTest {

    public static void main(String[] args) {
        String s = "reverse me";
        String reversed = "";

        int length = s.length();

        for (int i= length - 1 ; i>=0 ;i--) {

            reversed = reversed + s.charAt(i);
        }
        System.out.println("Reversed String: "+reversed);

        String[] or = s.split(" ");
        String re ="";
        int size = or.length;
        for (int i = size-1; i>=0;i--){
            re = re + or[i] + " ";
        }

        System.out.println("reversed word: "+re.trim());
    }
}
