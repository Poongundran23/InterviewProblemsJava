package interviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class RemoveCommonCharsTest {

    public static void main(String[] args){
        String s1 = "12345";
        String s2 = "34567";

        List<String> sl2 = new ArrayList<String>();
        for(String st : s2.split("")) {
            sl2.add(st);
        }

        List<String> sl1 = new ArrayList<String >();
        for(String st : s1.split("")){
           sl1.add(st);
        }

        sl2.removeAll(sl1);
        System.out.println(sl2);
    }
}
