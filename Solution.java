class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 1;
        for(int curr = 2; curr < nums.length; curr++)
        {
            if(nums[curr]!=nums[prev-1])
            {
                nums[++prev]=nums[curr];
            }
        }
        return prev+1;
    }
}