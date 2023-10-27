package interviewProblems;

import java.util.HashMap;
import java.util.Map;

public class CountOfLettersInString {

    public static void main(String[] args) {
        String s = "MyCount";

        HashMap<Character, Integer> l = new HashMap<>();

        for(int i = 0; i<s.length(); i++ ){
            if(l.containsKey(s.charAt(i))){
                int c = l.get(s.charAt(i));
                l.put(s.charAt(i),c+1);
            } else {
                l.put(s.charAt(i),1);
            }
        }

        System.out.println(l);
    }
}
