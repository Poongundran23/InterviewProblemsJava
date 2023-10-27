package interviewProblems;

public class OddAndEvenNumbersTest {

    public static void main(String[] args) {

        // counts of odd an even number and their sum
        int oddCount = 0;
        int oddSum = 0;
        int evenCount = 0;
        int evenSum = 0;

        for (int i = 1; i<=100; i++) {
            if (i%2 == 0) {
                evenCount += 1;
                evenSum += i;
            } else {
                oddCount += 1;
                oddSum += i;
            }
        }
        System.out.println("Counts and Sum of odd and even numbers:");
        System.out.println("Odd count: "+oddCount);
        System.out.println("Odd sum: "+ oddSum);
        System.out.println("Even count: "+evenCount);
        System.out.println("Even sum: "+evenSum);
        System.out.println("==========================================");

        
    }
}
