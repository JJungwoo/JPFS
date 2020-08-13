package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 차집합 {

    static int nA, nB;
    static int tmp;
    static Set<Integer> as = new HashSet<>();

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        nA = Integer.parseInt(st.nextToken());
        nB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<nA;i++) {
            tmp = Integer.parseInt(st.nextToken());
            as.add(tmp);
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<nB;i++) {
            tmp = Integer.parseInt(st.nextToken());
            if(as.contains(tmp))
                as.remove(tmp);
        }

        bw.write(as.size()+"\n");
        for(Integer i : as)
            bw.write(i+" ");
        bw.write("\n");
        bw.close();
    }
}


