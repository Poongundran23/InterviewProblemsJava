package interviewProblems;

public class FindRecurrenceOfANumber {

    public static void main(String[] rags) {

        String s = "abracadabra";
        char[] c = s.toCharArray();

        char tofind = 'a';
        int occurence = 0;

        for (char ch : c) {
            if (ch == tofind) {
                occurence++;
            }
        }
        System.out.println(occurence);

        // without iteration
        int actLength = s.length();

        int changedLength = s.replace("a","").length();

        System.out.println(actLength-changedLength);

    }
}

