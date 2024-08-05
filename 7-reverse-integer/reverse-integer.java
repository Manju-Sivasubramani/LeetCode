class Solution {
    public int reverse(int x) {
        int p=0;
        while(x!=0){
            int rem=x%10;
            if(p>Integer.MAX_VALUE/10||p<Integer.MIN_VALUE/10)
            {
             return 0; 
            }
            p=(p*10)+rem;
            x=x/10;
        }
        return p;
    }
}