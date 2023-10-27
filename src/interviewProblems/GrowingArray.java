package interviewProblems;

import javax.naming.PartialResultException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class GrowingArray {
    static int[] array = new int[1];
    int index = 0;
    int sizeOfArray = 1;

    public void addNo(int n) {
        if (index == sizeOfArray) {
            int[] temp = null;
            if (index == sizeOfArray) {
                temp = new int[sizeOfArray * 2];
                for (int j = 0; j < array.length; j++) {
                    temp[j] = array[j];
                }
                array = temp;
                array[index] = n;
                index++;
                sizeOfArray = sizeOfArray * 2;
            }
        } else {
            array[index] = n;
            index++;
        }
    }

    public static void main(String[] args) {


        GrowingArray g = new GrowingArray();
        g.addNo(10);
        g.addNo(20);
        g.addNo(30);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }
}
