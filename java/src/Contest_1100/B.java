package Contest_1100;

import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        for(int i = 0; i < testCases; i++){
            int size =  input.nextInt();

            int[] a = new int[size];
            int[] b = new int[size];

            for(int j = 0; j < size; j++){ a[j] = input.nextInt();}
            for(int j = 0; j < size; j++){ b[j] = input.nextInt();}

            long sumB = 0;
            int maxMin = Integer.MIN_VALUE;

            for(int j = 0; j < size; j++){
                    int max = Math.max(a[j], b[j]);
                    int min = Math.min(a[j], b[j]);

                    sumB += max;
                    if(min > maxMin){
                        maxMin = min;
                    }
            }
            System.out.println(sumB + maxMin);
        }
    }
}
