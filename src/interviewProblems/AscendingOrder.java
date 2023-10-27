package interviewProblems;

public class AscendingOrder {

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6};
        int temp;

        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++) {
                if (a[i] > a[j]){
                    temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                }
            }
        }

        System.out.println("Median : "+a[a.length/2]);

        System.out.println("Ascending order: \n");
        for (int j : a) {
            System.out.print(j);
        }

        System.out.println("Descending order: \n");
        for (int i=a.length-1; i>0;i--) {
            System.out.print(a[i]);
        }
        System.out.println(a[0]);



    }
}
