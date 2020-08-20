package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int k;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        for(int i=0;i<k;i++) {
            int input;
            input = scanner.nextInt();
            if(input == 0 && !st.empty()) {
                st.pop();
            }else{
                st.push(input);
            }
        }
        int ans = 0;
        for(int i : st) {
            ans += i;
        }
        System.out.println(ans);
    }
}
