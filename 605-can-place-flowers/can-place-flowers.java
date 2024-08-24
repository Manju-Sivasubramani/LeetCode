class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plc_ctr=0;
        if(n==0){
            return true;
        }
        if(flowerbed.length==1&&flowerbed[0]==0&&n==1){
            return true;
        }
        if(flowerbed[0]==0&&flowerbed.length>1){
            if(flowerbed[1]==0){
                flowerbed[0]=1;
                plc_ctr++;
            }
        }
        if(flowerbed[flowerbed.length-1]==0&&flowerbed.length>1){
            if(flowerbed[flowerbed.length-2]==0){
                flowerbed[flowerbed.length-1]=1;
                plc_ctr++;
            }
        }
        for(int ind=1;ind<flowerbed.length-2;ind++){
            if(flowerbed[ind]==0&&flowerbed[ind-1]==0&&flowerbed[ind+1]==0){
                flowerbed[ind]=1;
                plc_ctr++;
            }
        }
        if(plc_ctr>=n){
            return true;
        }
        return false;
    }
}