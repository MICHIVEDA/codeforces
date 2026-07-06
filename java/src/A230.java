import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A230 {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
               if(st.hasMoreTokens()){
                   str = st.nextToken("\n");
               }else {
                   str = br.readLine();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class Dragon implements Comparable<Dragon>{
        int strength;
        int boost;

        public Dragon(int strength, int boost) {
            this.strength = strength;
            this.boost = boost;
        }

        public int getStrength() {
            return strength;
        }

        public int getBoost() {
            return boost;
        }

        @Override
        public int compareTo(Dragon dragon) {
            return this.strength - dragon.strength;
        }
    }



    public static void main(String[] args) {
        FastReader f = new FastReader();
        int s = f.nextInt();
        int n = f.nextInt();



        Dragon[] array = new Dragon[n];
        for(int i = 0; i < n; i++){
            int st = f.nextInt();
            int boost = f.nextInt();
            array[i] = new Dragon(st, boost);
        }
        Arrays.sort(array);

        for(int i = 0; i < n; i++){
            if(array[i].getStrength() >= s){
                System.out.println("NO");
                return;
            }else{
                s += array[i].getBoost();
            }
        }
        System.out.println("YES");
    }
}
