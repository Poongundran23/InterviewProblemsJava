package interviewProblems;

public class DiagonalDifference {
    public static int[][] createMDArray() {
        int rows = 5;
        int columns = 5;

        int[][] array = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public void caluculateDifference() {
        int[][] array = createMDArray();
        int d = 3;
        int pd = 0;
        int sd = 0;

        for(int m = 0; m < d; m++){
            for(int n = d-1; n >= 0; n--){
                sd = sd + array[m][n];
                m += 1;;
            }
        }
        System.out.println(sd);

        for(int m = 0; m < d; m++){
            for(int n = 0; n < d; n++){
                pd = pd + array[m][n];
                m +=1;
            }
        }
        System.out.println(pd);

        System.out.println(Math.abs(pd-sd));
    }

    public static void main(String[] args) {
        DiagonalDifference t = new DiagonalDifference();
        t.caluculateDifference();
    }
}
