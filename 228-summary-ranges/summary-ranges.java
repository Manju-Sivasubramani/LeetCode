class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int n=nums.length;
        if(nums.length==0){
            return list;
        }
        int start=nums[0];
        int end=0;
        String val="";
        for(int i=0;i<n-1;i++){
            if((nums[i]+1)!=nums[i+1]){
                end=nums[i];
                if(end!=start){
                    val=start+"->"+end;
                    list.add(val);
                }
                else{
                    val=end+"";
                    list.add(val);
                }
                start=nums[i+1];
            }
        }
        end=nums[n-1];
        if(end!=start){
            val=start+"->"+end;
            list.add(val);
        }
        else{
            val=end+"";
            list.add(val);
        }
        return list;
    }
}