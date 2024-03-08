import java.io.*;
import java.util.*;

public class backjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String[] arr;
        Set set = new HashSet();
        for (int i = 0; i < a; i++) {
            set.add(br.readLine());
        }
        arr = new String[set.size()];
        Iterator it = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            arr[i] = it.next().toString();
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}