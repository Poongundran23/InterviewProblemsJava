package interviewProblems;

import java.util.Scanner;

public class SwappingNumbersWithoutThirdVariableTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: \n");
        int a = s.nextInt();
        int b = s.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped nos: ");
        System.out.println(a);
        System.out.println(b);
    }
}
