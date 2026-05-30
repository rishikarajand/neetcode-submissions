class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int longest=0;
        for(int num:nums){
            set.add(num);
        }

        for(int num: nums){
            // checks if set contains the left of sequence
           if(!set.contains(num-1)){
                int length=1;
                // +1 to length if it contains the right of sequence
                while(set.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);
           }
        }
        return longest;
    }
}
