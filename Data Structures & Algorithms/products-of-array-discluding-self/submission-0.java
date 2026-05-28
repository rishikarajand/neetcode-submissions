class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len= nums.length;
        
        int [] prefix= new int[len];
        int [] sufix= new int[len];
        int [] result= new int[len];

        prefix[0]=1;
        for(int i=1; i<len; i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        sufix[len-1]=1;
        for(int i=len-2; i>=0; i--){
            sufix[i]=sufix[i+1]*nums[i+1];
        }
        for (int i = 0; i < len; i++) {
            result[i] = prefix[i] * sufix[i];
        }

        return result;

    }
}