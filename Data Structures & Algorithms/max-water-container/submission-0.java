class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r= heights.length-1;
        int vol=0;
        while(l<r){
            int curVol= Math.min(heights[l],heights[r])* (r-l);
        
            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
            vol= Math.max(vol,curVol);
        }

        return vol;

    }
}
