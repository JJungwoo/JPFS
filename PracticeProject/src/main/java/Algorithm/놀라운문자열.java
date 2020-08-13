package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 놀라운문자열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr;
        StringBuilder sb = new StringBuilder();
        while(!(inputStr = br.readLine()).equals("*")) {
            HashSet<String> hashSet = new HashSet<>();
            int len = inputStr.length();
            boolean isSurprise = true;

            for(int i = 1; i < len; i++) {
                hashSet.clear();
                for(int j = 0; j < len - i; j++) {
                    String str = Character.toString(inputStr.charAt(j)) + Character.toString(inputStr.charAt(j + i));
                    if(hashSet.contains(str) == false)
                        hashSet.add(str);
                    else {
                        isSurprise = false;
                        break;
                    }
                }
                if(!isSurprise)
                    break;
            }

            if(isSurprise)
                sb.append(inputStr).append(" is surprising.");
            else
                sb.append(inputStr).append(" is NOT surprising.");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
