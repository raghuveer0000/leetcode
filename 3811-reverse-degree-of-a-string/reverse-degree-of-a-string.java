class Solution {
    public int reverseDegree(String s) {
      int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);           
            int revIndex = 26 - (ch - 'a') ;
            result += revIndex * (i + 1);
        }
        
        return result;
    }
}

