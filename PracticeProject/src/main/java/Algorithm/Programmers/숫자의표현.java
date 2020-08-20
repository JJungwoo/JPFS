package Algorithm.Programmers;

public class 숫자의표현 {

    public int solution(int n) {
        int answer = 0;
        if(n == 1 || n == 0)
            return n;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=i;j<=n;j++){
                if(sum + j > n) break;
                else if(sum+j == n){
                    answer++;
                    break;
                }
                sum += j;
            }
        }
        return answer;
    }
}
