class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                num[j]=nums[i];
                j++;
            }
        }
        int m=j;
        for(int i=m;i<n;i++){
            num[i]=0;
        }
        for(int i=0;i<n;i++){
            nums[i]=num[i];
        }
        return ;
    }
}