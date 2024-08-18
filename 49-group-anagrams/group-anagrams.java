class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
                char[] ch=str.toCharArray();
                Arrays.sort(ch);
                String sortedArr=new String(ch);
                if(!map.containsKey(sortedArr)){
                   map.put(sortedArr,new ArrayList<>());
                }
                map.get(sortedArr).add(str);
            }
        return new ArrayList<>(map.values());
    }
}