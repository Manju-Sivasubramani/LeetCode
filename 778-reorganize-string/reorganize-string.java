class Solution {
    public String reorganizeString(String s) {
        int a[] = new int[26];
        for(char c : s.toCharArray())
            a[c-'a']++;
        
        int max = 0, letter=0;
        for(int i=0;i<26;i++)
            if(a[i]>max){
                max = a[i];
                letter = i;
            }
        if(max > (s.length()+1)/2) return "";
        char res[] = new char[s.length()];
        int index =0;

        while(a[letter]-- > 0){
            res[index]= (char)(letter+'a');
            index+=2;
        }
        
        for(int i=0;i<26;i++){
            while(a[i]-- > 0){
                if(index >= s.length()) index = 1;
                res[index]= (char)(i+'a');
                index+=2;
            }
        }

        return String.valueOf(res);
    }
}