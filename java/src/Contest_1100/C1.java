package Contest_1100;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = input.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = input.nextInt();
            }

            List<Integer> sol = new LinkedList();
            int count = 0;
            boolean flipped = false;

            for(int j = n-1; j >= 0; j--){
                int cVal = flipped ? (arr[j]*-1) : arr[j];
                if(cVal > 0){
                    sol.add(j+1);
                    count++;
                    flipped = !flipped;
                }
            }
            System.out.println(count);
            while(!sol.isEmpty()){
                System.out.print(sol.removeFirst() + " ");
            }
            System.out.println();
        }
    }
}
