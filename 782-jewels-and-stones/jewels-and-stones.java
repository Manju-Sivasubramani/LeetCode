class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length();
        int m=stones.length();
        int count=0;
        for(int i=0;i<n;i++){
           char ch=jewels.charAt(i);
           for(int j=0;j<m;j++){
            char chr=stones.charAt(j);
            if(ch==chr){
                count++;
            }            
           }
        }
        return count;
    }
}