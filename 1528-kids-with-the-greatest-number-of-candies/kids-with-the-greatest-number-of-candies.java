class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
         int n=candies.length;
         int max=0;
         for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
         }
         for(int i=0;i<n;i++){
            if(candies[i]==max){
                list.add(true);
                continue;
            }
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
         }
         return list;
    }
}