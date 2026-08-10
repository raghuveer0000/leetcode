import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w=s.split(" ");
        HashMap<Character,String>map1=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        if(pattern.length()!=w.length)return false;
        for(int i=0;i<pattern.length();i++){
            char ch1=pattern.charAt(i);
            String a=w[i];
            if(map1.containsKey(ch1) && !map1.get(ch1).equals(a))return false;
            if(map2.containsKey(a) && !map2.get(a).equals(ch1))return false;
            map1.put(ch1,a);
            map2.put(a,ch1);
        }
        return true;
    }
}