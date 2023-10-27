package interviewProblems;

import java.util.Scanner;
/*
 * This logic can be used for palindrome number
 */
public class ReverseANumberTest {

    public static void main(String[] args){

        Scanner rn = new Scanner(System.in); System.out.println("Enter a number"); int n = rn.nextInt();
        int a, i = 0, j = 0;
        a = n;
        while (a > 0) {
            i = a % 10;
            j = (j * 10) + i;
            a = a / 10;
        }
        System.out.println("Reverse number is=" + j);

        // palindrome check
        if (j == n) {
            System.out.println("Wow! The number is also a palindrome");
        }

        // armstrong number check
        a = n;
        j = 0;
        while (a > 0) {
            i = a % 10;
            j = j + (i * i * i);
            a = a / 10;
        }
        if ( j == n) {
            System.out.println("The number is also an armstrong number");
        }
    }
}
