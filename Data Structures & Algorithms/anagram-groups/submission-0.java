class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map= new HashMap<>();

        for(String str:strs){
            char[] arr= str.toCharArray();
            
            Arrays.sort(arr);

            String key= new String(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            List<String> list = map.get(key);
            list.add(str);

        }
        List<List<String>> result= new ArrayList<>(map.values());
        return result;
    }
}
