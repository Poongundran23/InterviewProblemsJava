package interviewProblems;

public class StringReplacementTest {

    public static void main(String[] args) {

        String s = "aeiou";

        char[] c = s.toCharArray();

        for (char ch : c){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ch = '*';
            }
            System.out.print(ch);
        }

        String st = "HAaEeIiOoUuP";

        System.out.println(st.replaceAll("[AaEeIiOoUu]","*"));
    }
}
