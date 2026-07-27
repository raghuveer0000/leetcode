import java.util.*;
class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        int sm=0;
        for(int i=0;i<word.length();i++){
            
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                cap++;
            }
            else{
                sm++;
            }          
        }
        if(cap==word.length()) return true;
        if(sm==word.length())return true;
        if(Character.isUpperCase(word.charAt(0)) && sm==word.length()-1)return true;
        else return false;
    }
}