import java.io.*;
import java.util.StringTokenizer;

public class backjoon_1654 {
    static long[] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new long[a];
        long max = -1;

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) max = arr[i];
        }

        bw.write(binarysearch(1, max) + "\n");
        bw.flush();
        bw.close();
    }
    static long binarysearch(long fir, long las) {
        long mid = 0;
        while (fir <= las) {
            mid = (fir + las) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / mid;
            }
            if (count >= n) {
                fir = mid + 1;
            }else {//count < n
                las = mid;
            }
        }
        return mid;
    }
}
