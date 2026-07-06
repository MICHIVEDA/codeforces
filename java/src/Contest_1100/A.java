package Contest_1100;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int l =  input.nextInt();
            int min = 1000;
            int max = 0;
            for(int j = 0; j < l; j++){
                int next = input.nextInt();
                if(next < min){
                    min = next;
                }
                if(next > max){
                    max = next;
                }
            }
            System.out.println((max-min + 1)/2);
        }
    }
}


