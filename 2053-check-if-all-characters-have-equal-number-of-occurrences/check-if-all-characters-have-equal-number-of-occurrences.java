class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq= new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
       int count=freq[s.charAt(0)-'a'];
       for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)-'a']!=count){
            return false;
        }
       }
       return true;
    }
}