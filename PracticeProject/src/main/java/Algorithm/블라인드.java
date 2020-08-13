package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 블라인드 {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n, m;   // 창문, 건물
        int ans[] = new int[5];
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        String[] build = new String[n*5];

        for(int i=0;i<n*5;i++){
            build[i] = br.readLine();
        }

        for(int i=0;i<n*5;i++){
            bw.write(build[i]+"\n");
        }
        bw.close();

    }
}
