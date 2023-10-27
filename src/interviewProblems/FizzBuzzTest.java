package interviewProblems;

/*
 * This is to replace the multiple of 3 with fizz and multiple of 5 with buzz
 * And replace multiple of both 3 and 5 with fizzbuzz
 */
public class FizzBuzzTest {

    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++) {
            if (i % (3*5) == 0) System.out.println("fizzbuzz");
            else if(i % 5 == 0) System.out.println("buzz");
            else if(i % 3 == 0) System.out.println("fizz");
            else System.out.println(i);
        }
    }
}
