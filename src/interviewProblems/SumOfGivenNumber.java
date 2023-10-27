package interviewProblems;

public class SumOfGivenNumber {

    public static void main(String[] args) {
        int a = 3456; int j = 0; int i;

        while(a>0){
            i = a % 10;
            j = j + i ;
            a = a/10;
        }
        System.out.println(j);
    }
}
