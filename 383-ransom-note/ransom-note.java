class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char letter : magazine.toCharArray()) {
            map.put(letter,map.getOrDefault(letter,0)+1);
        }
        for (char letter : ransomNote.toCharArray()) {
            if(map.getOrDefault(letter, 0) <= 0){
                return false;
            }
            if(map.getOrDefault(letter, 0) > 0){
                map.put(letter,map.getOrDefault(letter,0)-1);
            }
        }
        return true;
    }
}