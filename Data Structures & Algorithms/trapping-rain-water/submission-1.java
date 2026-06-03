class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left= 0;
        int right= height.length-1;
        int maxL=height[left];
        int maxR=height[right];
        int maxWater=0;

        while(left<right){
            if(maxL<maxR){
                left++;
                maxL= Math.max(maxL, height[left]);
                maxWater+= maxL-height[left];
            }else{
                right--;
                maxR= Math.max(maxR, height[right]);
                maxWater+= maxR- height[right];
            }
        }
        return maxWater;
    }
}
