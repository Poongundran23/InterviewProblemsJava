package interviewProblems;

import java.lang.reflect.Array;
import java.util.*;

public class DuplicateLetters {

    public static void main(String[] args) {

        String d = "asdadsafasd";

        char[] ch = d.toCharArray();

        String nd = Character.toString(ch[0]);

        for (char b : ch) {
            if (!nd.contains(Character.toString(b))) {
                nd = nd + b;
            }
        }

        System.out.println(nd);


        // remove duplicate from no
        int n = 23432214;

        String no = Integer.toString(n);

        char[] nos = no.toCharArray();

        String nn = Character.toString(nos[0]);

        for (char b : nos) {
            if (!nn.contains(Character.toString(b))) {
                nn = nn + b;
            }
        }

        System.out.println(nn);
    }
}
