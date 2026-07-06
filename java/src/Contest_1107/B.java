package Contest_1107;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            long x = sc.nextLong();
            long y = 2;
            while(!good(y) || !good(x*y)){
                y += 1;
            }

            System.out.println(y);

        }
    }

    public static boolean good(long n){
        if(n == 0) return true;
        boolean digits[] = new boolean[10];
        int diffCount = 0;

        while(n > 0) {
            int d = (int) (n % 10);

            if (!digits[d]) {
                digits[d] = true;
                diffCount++;
                if(diffCount > 2) return false;
            }

            n /= 10;
        }
        return true;
    }
}
