class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer>map1= new HashMap<>();
        HashMap<Character,Integer>map2= new HashMap<>();
        
        //this is for string s
        for(char ch: s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch, 0) + 1);
        }

        //this is for string t
        for(char ch: t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch, 0) + 1);
        }

        return map1.equals(map2);


    }
}
