class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        while(start<n&&nums[start]<target){
            start++;
        }
        return start;
    }
}