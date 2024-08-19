class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int val=0;
        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        int res=1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
}