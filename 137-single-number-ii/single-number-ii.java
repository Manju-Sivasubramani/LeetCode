class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int num=0;
        for(int i=0;i<n;i++){
            num=nums[i];
            int flag=0;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(nums[j]==num){
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        return num;
    }
}