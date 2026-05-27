class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i]= list.get(i).getKey();
        }
        return result;

    }
}
