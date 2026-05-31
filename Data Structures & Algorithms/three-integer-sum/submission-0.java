class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array to use the two-pointer technique
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            //Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            //Initialize two pointers
            int left = i + 1;
            int right = nums.length - 1;
            
            // Use two pointers to find pairs that sum to -nums[i]
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if (currentSum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move left pointer forward and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Move right pointer backward and skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers inward after finding a match
                    left++;
                    right--;
                    
                } else if (currentSum < 0) {
                    // Sum is too small, move left pointer to get a larger value
                    left++;
                } else {
                    // Sum is too large, move right pointer to get a smaller value
                    right--;
                }
            }
        }
        
        return result;
    }
}