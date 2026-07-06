import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B263 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        int k =  input.nextInt();

        if (k > n) {
            System.out.println(-1);
            return;
        }

        Integer[] squares = new Integer[n];

        for(int i=0; i<n; i++){
            squares[i] = input.nextInt();
        }


        Arrays.sort(squares, Collections.reverseOrder());

        System.out.println(squares[k-1] + " " + 0);
    }
}
