class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i, j  in enumerate(nums): 
            number = target -nums[i]
            if number in nums:
                for p, q  in enumerate(nums): 

                    if number == nums[p] :
                        return  [i,p]

                
        