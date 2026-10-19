class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) : 
            return False 
        
        count = dict()
        count2 = dict()
        # take all alphabets and add it in the dictionary , count the occurance from the all from the list and compare the count.
        for char in s:
            char = char.lower()
            count[char] = count.get(char,0)+1

        for char in t:
            char = char.lower()
            count2[char] = count2.get(char,0)+1

        return count == count2

 
            
        