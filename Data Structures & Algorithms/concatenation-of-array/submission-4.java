class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ac =  Arrays.copyOf(nums, nums.length + nums.length);
        for(int i = 0; i < nums.length ; i++){
            ac[nums.length + i] = nums[i];
        }
        return ac;
    }
}