class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # setc= set()
        # for i in nums:
        #     if i in setc:
        #         return True
        #     setc.add(i)
        # return False
        # setc = set()
        # if len(nums) != len(set(nums)) :
        #     return True
        # return False
        return len(set(nums)) < len(nums)
            
        