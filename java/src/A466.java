import java.util.Scanner;

public class A466 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int a = cin.nextInt();
        int b = cin.nextInt();

        if(a * m <= b){
            System.out.println(a * n);
        }else{
            int cost = (n / m) * b;
            int rem = n%m;

            cost += Math.min(b, rem*a);
            System.out.println(cost);
        }
    }
}
