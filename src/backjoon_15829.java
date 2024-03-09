import java.io.*;
import java.util.*;

public class backjoon_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String mun = br.readLine();

        bw.write(Hashing(a, mun) + "\n");

        bw.flush();
        bw.close();
    }
    static long Hashing(int length, String mun) {
        long result = 0;
        int[] arr = new int[26];
        Arrays.setAll(arr, i -> i + 1);

        for (int i = 0; i < length; i++) {
            result += multy(i, mun) * arr[mun.charAt(i) - 'a'];
            result %= 1234567891;
        }

        return result;
    }
    static long multy(int a, String temp) {
        long num = 1;
        for (int i = 0; i < a; i++) {
            num *= 31;
            num %= 1234567891;
        }
        return num;
    }
}