class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int indx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                indx=i;
            }
        }
        return indx;
    }
}