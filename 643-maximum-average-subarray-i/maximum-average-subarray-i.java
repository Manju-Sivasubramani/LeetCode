class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
        double max= Double.NEGATIVE_INFINITY;
        for(int ind=0;ind<nums.length-k+1;ind++){
            int sum=0;
            for(int index=ind;index<k+ind;index++){
                sum=sum+nums[index];
            }
            double avg=sum/(double)k;
            if(avg>max){
                max=avg;
            }
        }
        return max;
    }
}