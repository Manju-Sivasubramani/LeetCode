class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map=new TreeMap<>();
        String[] words=s.split(" ");
        for(String word:words){
            int length=word.length();
            char lastChar=word.charAt(length-1);
            int i=lastChar-'0';

            String str=word.substring(0,length-1);
            map.put(i,str);
        }
        StringBuilder sortedSen=new StringBuilder();
        for(String word:map.values()){
            sortedSen.append(word);
            sortedSen.append(" ");
        }
        return sortedSen.toString().trim();
    }
}