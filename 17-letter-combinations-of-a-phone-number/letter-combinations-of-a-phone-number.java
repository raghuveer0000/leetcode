class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String>map=new HashMap<>();
        String[] arr=new String[digits.length()];
        List<String>res=new ArrayList<>();
        res.add("");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    for(int i=0;i<digits.length();i++){
        String a=map.get(digits.charAt(i));
        List<String>temp=new ArrayList<>();
        for( String prefix:res){
            for(char c : a.toCharArray()){ 
                temp.add(prefix+c);
            }
        }
        res=temp;
    }
    return res;
    }
}