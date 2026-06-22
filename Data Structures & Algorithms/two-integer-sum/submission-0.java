class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> keyVal= new HashMap<>();
        int compliement;
        for(int i =0; i < nums.length ;i++){
            compliement = target - nums[i];
            if(keyVal.containsKey(compliement)){
                return new int[]{keyVal.get(compliement),i};
            }
            keyVal.put(nums[i],i);
        }
        return new int[]{};
    }
}
