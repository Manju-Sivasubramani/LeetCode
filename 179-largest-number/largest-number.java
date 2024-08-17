class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] str=new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        String temp="";
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
            {
                String a=(str[i]+str[j]);
                String b=(str[j]+str[i]);
                if(b.compareTo(a)>0)
                {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                }
            }
        }
        String st="";
        for(int i=0;i<n;i++){
            st=st+str[i];
        }
        if(st.charAt(0)=='0'){
            st="0";
        }
        return st;
    }     
}
