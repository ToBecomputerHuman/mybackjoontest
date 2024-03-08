import java.io.*;
import java.util.*;

public class backjoon_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        for (int i = 0; i < a; i++) {
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == 'X') {
                    count = 0;
                }else {
                    count++;
                    sum += count;
                }
            }
            bw.write(sum + "\n");
            sum = 0;
            count = 0;
        }

        bw.flush();
        bw.close();
    }
}