class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> tset = new HashSet<>();
        for( int num: nums){
            tset.add(num);
        }
        if(tset.size() != nums.length){
            return true;
        }else{
            return false;
        }
    }
}