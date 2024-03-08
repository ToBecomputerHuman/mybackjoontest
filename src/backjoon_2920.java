import java.io.*;
import java.util.*;

public class backjoon_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean flag = false;
        if (arr[0] == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    flag = true;
                }
            }
            if (flag) {
                bw.write("mixed\n");
            }else {
                bw.write("ascending\n");
            }
        }else if (arr[0] == 8) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr.length - i){
                    flag = true;
                }
            }
            if (flag) {
                bw.write("mixed\n");
            }else {
                bw.write("descending");
            }
        }else {
            bw.write("mixed\n");
        }

        bw.flush();
        bw.close();
    }
}