class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){ // check if length not equal, if not equal then they cannot be anagrams
            return false;
        }

        int[] count= new int[26]; // stores frequency of each character , a to z so 26 chars. initially all will be zero

        for(int i=0; i < s.length(); i++){ // as every position in the array is initially 0 , we first get the chars position by substracting it from a as a=97 
            count[s.charAt(i) - 'a']++; // once we get the position in nums , we then increment it by 1 wrt s and decrement again wrt t
            count[t.charAt(i) - 'a']--; // this way same occurances cancels out and yields zero in that place . if all zero then anagram , if not then not anagram
        }

        for(int num :count){
            if(num!=0){
                return false;
            }
        }

        return true;
        


       
    }
}
