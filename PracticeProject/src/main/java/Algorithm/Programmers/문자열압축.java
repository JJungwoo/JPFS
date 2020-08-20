package Algorithm.Programmers;

public class 문자열압축 {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1;i<s.length();i++) {
            int idx = 0;
            String com = "", sub = "";
            while(idx + i <= s.length()) {
                sub = s.substring(idx, idx+i);
                int cnt = 1;
                idx += i;
                while(idx + i <= s.length()) {
                    if(!s.substring(idx, idx+i).equals(sub))
                        break;
                    idx += i;
                    cnt++;
                }
                if(cnt != 1) com += String.valueOf(cnt) + sub;
                else com += sub;
            }
            com += s.substring(idx);
            answer = Math.min(answer, com.length());
        }
        return answer;
    }
}
