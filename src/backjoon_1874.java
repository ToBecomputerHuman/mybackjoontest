import java.io.*;
import java.util.*;

public class backjoon_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int[] start = new int[a];
        Stack<Integer> stack = new Stack<>();
        StringBuffer result = new StringBuffer();
        StringBuffer answer = new StringBuffer();
        StringBuffer plmaanswer = new StringBuffer();
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            answer.append(arr[i]);
        }
        Arrays.setAll(start, i -> i + 1);

        int arrpointer = 0;
        int startpointer = 0;
        while (startpointer + arrpointer < arr.length + start.length) {
            if (stack.isEmpty()) {
                stack.push(start[startpointer++]);
                plmaanswer.append("+\n");
            }
            if (stack.peek() == arr[arrpointer]) {
                result.append(stack.pop());
                arrpointer++;
                plmaanswer.append("-\n");
            }else {
                if (startpointer == start.length) {
                    while (!stack.isEmpty()) result.append(stack.pop());
                    break;
                }else {
                    stack.push(start[startpointer]);
                    startpointer++;
                    plmaanswer.append("+\n");
                }
            }
        }

        if (answer.toString().equals(result.toString())) {
            bw.write(plmaanswer.toString());
        }else {
            bw.write("NO\n");
        }
        bw.flush();
        bw.close();
    }
}
