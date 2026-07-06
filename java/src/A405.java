import java.util.Arrays;
import java.util.Scanner;

public class A405 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] cubes = new int[n];
        for(int i = 0; i < n; i++){
            cubes[i] = input.nextInt();
        }

        Arrays.sort(cubes);
        for(int i = 0; i < cubes.length; i++){
            System.out.print(cubes[i] + " ");
        }
    }
}
