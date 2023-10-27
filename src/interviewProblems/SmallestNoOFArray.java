package interviewProblems;

import java.util.Arrays;

public class SmallestNoOFArray {

    public static void main(String[] args){
        int[] in = {9,4,2,6,3};

        int smallestno = Integer.MAX_VALUE;

        for(int i = 0; i < in.length; i++){
            if(in[i] < smallestno){
                smallestno = in[i];
            }
        }
        System.out.println(smallestno);
    }
}
