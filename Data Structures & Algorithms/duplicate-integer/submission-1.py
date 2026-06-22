class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        setc= set()
        for i in nums:
            if i in setc:
                return True
            setc.add(i)
        return False
            
        