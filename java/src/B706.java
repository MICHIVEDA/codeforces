import java.util.Scanner;

public class B706 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] prices =  new int[n];
        int maxPrice = 0;
        for (int i = 0; i < n; i++) {
            prices[i] = input.nextInt();
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

        int[] c = new int[maxPrice+1];
        for(int i = 0; i < n; i++){
            c[prices[i]]++;
        }

        for(int i = 1; i <= maxPrice; i++){
            c[i] += c[i-1];
        }

        int q = input.nextInt();
        for(int i = 0; i < q; i++){
            int budget =  input.nextInt();
            if(budget > maxPrice){
                System.out.println(n);
            }else{
                System.out.println(c[budget]);
            }
        }

    }
}
