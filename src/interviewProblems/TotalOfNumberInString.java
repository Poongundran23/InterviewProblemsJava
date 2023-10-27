package interviewProblems;

public class TotalOfNumberInString {

    public static void main(String[] args){
        String s = "dfvgbhnj34";

        int n = Integer.parseInt(s.replaceAll("[a-zA-Z]",""));

        int j = 0, i = 0;

        while(n > 0) {
            i = n % 10;
            j = j + i;
            n = n / 10;
        }

        System.out.println(j);

    }
}
