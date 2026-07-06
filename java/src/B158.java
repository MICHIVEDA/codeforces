import java.util.Scanner;

public class B158 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] count = new int[5];

        for(int i = 0; i < n; i++){
            count[cin.nextInt()] += 1;
        }

        int sum = count[4];

        sum += count[3];
        count[1] = Math.max(0, count[1]-count[3]);

        sum += count[2]/2;
        count[2] = count[2]%2;

        if(count[2] == 1){
            sum += count[2];
            count[1] = Math.max(0, count[1]-2);
        }

        sum += count[1]/4;
        if(count[1] % 4 > 0){
            sum += 1;
        }

        System.out.println(sum);

    }
}
