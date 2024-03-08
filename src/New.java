import java.io.*;
import java.util.*;

public class New {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime = makeprimearr();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 0; j <= a / 2; j++) {
                if (!prime[j] && !prime[a - j]) count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
    static boolean[] makeprimearr() {
        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;
        for (int j = 2; j <= Math.sqrt(1000001); j++) {
            if (arr[j]) continue;
            for (int i = j + j; i < 1000001; j += j) {
                arr[i] = true;
            }
        }
        return arr;
    }
}