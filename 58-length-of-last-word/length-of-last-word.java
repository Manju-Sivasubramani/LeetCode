class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        int n=str.length;
        String st=str[n-1];
        int m=st.length();
        return m;
    }
}