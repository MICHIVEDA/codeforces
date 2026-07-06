import java.util.Scanner;

public class B474 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];
        arr[0] = cin.nextInt();
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + cin.nextInt();
        }

        int juicy = cin.nextInt();

        for(int i = 0; i < juicy; i++){
            System.out.println(binarySearch(arr, cin.nextInt()));
        }
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans+1;
    }
}
