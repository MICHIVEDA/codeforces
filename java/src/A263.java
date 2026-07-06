import java.util.Scanner;

import static java.lang.Math.abs;

public class A263 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        for (int i = 1; i <= 25; i++) {
            int n = input.nextInt();
            if(n == 1){
                int row = ((count-1)/5)+1;
                //System.out.println(row);
                int col =  (count-1)%5+1;
                //System.out.println(col);
                System.out.println(abs(3-row)+abs(3-col));
                break;
            }
            count++;
        }
    }
}
