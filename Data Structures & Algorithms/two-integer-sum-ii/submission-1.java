class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r=nums.length-1;
        int l=0;

        while(l<r){
            
            if(nums[l]+nums[r]>target){
                r--;
            }else if(nums[l]+nums[r]<  target){
                l++;
            }else{
                return new int[]{l+1, r+1};
            }

        }
        return new int[0];
    }
}
