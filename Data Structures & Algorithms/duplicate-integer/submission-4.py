class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        tset= set()
        tset.update(nums)
        if len(tset) != len(nums): 
            return True
        else: 
            return False
            

        