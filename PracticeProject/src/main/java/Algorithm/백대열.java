package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백대열 {

    public static int gcd(int A, int B) {
        if(B == 0) return A;
        else return gcd(B, A%B);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");

        int N, M;
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int res = gcd(N, M);
        System.out.println(N/res +":"+ M/res);
    }

}
