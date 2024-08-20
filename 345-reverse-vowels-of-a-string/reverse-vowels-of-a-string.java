class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int start=0;
        int end=n-1;
        while(start<end){
            while(start<end&&!vowels.contains(ch[start])){
                start++;
            }
            while(start<end&&!vowels.contains(ch[end])){
                end--;
            }
            if(start<end){
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        String str=new String(ch);
        return str;
    }
}