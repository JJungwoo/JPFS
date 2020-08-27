package Algorithm;

import java.io.*;
import java.util.*;

/*
class Pair {
    Integer value;
    Integer cnt;

    public Pair(Integer value, Integer cnt) {
        this.value = value;
        this.cnt = cnt;
    }

    public Integer first() {
        return value;
    }

    public Integer second() {
        return cnt;
    }
}
*/

public class 숨바꼭질3 {
    final static int dir[] = {1, -1, 2};
    final static int MAX = 100001;
    public static int solve(int s, int e) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int []o1, int []o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        boolean[] visited = new boolean[MAX];
        pq.offer(new int[] {s, 0});
        visited[s] = true;

        while(!pq.isEmpty()) {
            int []cur = pq.poll();
            visited[cur[0]] = true;
            if(cur[0] == e)
                return cur[1];
            for(int i=0; i<3; i++){
                int next = cur[0];
                boolean check = false;
                if(i==2) {
                    check = true;
                    next *= dir[i];
                } else {
                    next += dir[i];
                }

                if(next < 0 || next >= MAX) continue;
                if(!visited[next]) {
                    if(!check)
                        pq.add(new int[]{next, cur[1]+1});
                    else
                        pq.add(new int[]{next, cur[1]});
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N, K;
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        System.out.println(solve(N, K));
    }
}
