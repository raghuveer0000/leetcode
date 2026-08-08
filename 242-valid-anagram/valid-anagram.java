class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        int n=s.length();
        int m=t.length();
        for(int  i=0;i<n;i++){
            char ch=s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int  i=0;i<m;i++){
            char ch=t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
    return map1.equals(map2);
    }
}