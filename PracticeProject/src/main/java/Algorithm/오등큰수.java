package Algorithm;

import java.util.*;

public class 오등큰수 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> alist = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0;i<n;i++){
            int tmp = s.nextInt();
            alist.add(tmp);
            if(hashMap.containsKey(tmp)){
                int value = hashMap.get(tmp);
                hashMap.put(tmp, ++value);
            }else{
                hashMap.put(tmp, 0);
            }
        }

        for(int i=0;i<alist.size();i++){

            System.out.println(hashMap.get(alist.get(i)));
        }
    }
}
