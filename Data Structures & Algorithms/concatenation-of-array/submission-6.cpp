class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> cpy = nums;
        for(const int& nums : nums){
            cpy.push_back(nums);
        }
        return cpy;
    }
};