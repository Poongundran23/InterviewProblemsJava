package interviewProblems;

public class RemoveTheDuplicateNumbers {

    public static int[] removeDup(int[] input) {

        int i = 1;
        int j = 0;
        if (input.length < 2) {
            return input;
        }

        while (i < input.length) {
            if (input[i] == input[j]) {
                i++;
            } else {
                input[++j] = input[i++];
            }
        }
        int[] output = new int[j + 1];
        for (int k = 0; k < output.length; k++) {
            output[k] = input[k];
        }
        return output;
    }

    public static void main(String[] a) {
        int[] input = {2, 2, 3, 3, 5, 4, 6};
        int[] output = removeDup(input);

        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
