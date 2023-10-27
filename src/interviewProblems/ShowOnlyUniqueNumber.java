package interviewProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShowOnlyUniqueNumber {

    public static void main(String[] args){
        List<Integer> a = Arrays.asList(1,1,2,2,2,3,4,4,5,5);
        Set<Integer> s = new HashSet<>();

        for(int i : a){
            s.add(i);
        }

        int occurence = 0;

        for(int i = 0; i < a.size(); i++ ){
            for(int j : a){
                if(j == a.get(i)){
                    occurence++;
                }
                if(occurence == 2){
                    occurence = 0;
                    if(s.contains(a.get(i))) {
                        s.remove(a.get(i));
                    }
                    break;
                }
            }
        }

        for(int st : s){
            System.out.println(st);
        }
    }
}
