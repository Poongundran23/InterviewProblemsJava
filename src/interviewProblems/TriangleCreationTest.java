package interviewProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TriangleCreationTest {

    public static void main(String[] args) {
        // creation of upward triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // creation of downward triangle
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for proper triangle
        for (int i = 1 ; i<=5; i++){
            for (int j = 1; j <=5-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //for numbers triangle
        int start = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j < i; j++ ){
                start += 1;
                System.out.print(start+" ");
            }
            System.out.println("");
        }

        //for right side triangle
        for(int i=1; i<=5; i++)
        {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted right triangle
        for(int i = 1; i <=5; i++){
            for(int k = 1; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <= 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for diamond triangle
        System.out.println("=======+++Diamond Pattern+++==========");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= 4; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 5-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

