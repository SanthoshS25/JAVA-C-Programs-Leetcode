class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        List<List<String>>  list1 = new ArrayList<>();
        for(int i = 0; i < strs.length;i++){
            List<String> list = map.getOrDefault(SortedString(strs[i]), new ArrayList<>());
            list.add(strs[i]);
            map.put(SortedString(strs[i]),list);
        }
        for (String i : map.keySet()) {
            list1.add(map.get(i));
        }
        return list1;
    }
    public String SortedString(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}