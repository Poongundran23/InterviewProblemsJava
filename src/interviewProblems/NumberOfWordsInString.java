package interviewProblems;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfWordsInString {

    public static void main(String[] args) {
        String s = "count my words count";

        String[] x = s.split(" ");

        HashMap<String, Integer> w = new HashMap<>();

        for (String sp : x) {
            if (w.containsKey(sp)) {
                int c = w.get(sp);
                w.put(sp, c + 1);
            } else {
                w.put(sp, 1);
            }
        }

        System.out.println(w);

        String c = "asdfsaassd";

        Map<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < c.length(); i++) {
            if (mp.containsKey(c.charAt(i))) {
                int n = mp.get(c.charAt(i));
                mp.put(c.charAt(i),n+1);
            } else {
                mp.put(c.charAt(i),1);
            }
        }

        System.out.println(mp);

        Set<Character> dc = mp.keySet();

        for (char d : dc) if (mp.get(d) > 1) System.out.print( d + " : " + mp.get(d));
    }
}
