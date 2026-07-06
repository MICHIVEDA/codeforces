package Contest_1107;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int x =  sc.nextInt();
            int y = sc.nextInt();

            if(x >= y && x % y == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
