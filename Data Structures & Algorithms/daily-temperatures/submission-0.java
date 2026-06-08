class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack <int[]> stack = new Stack<>();
        int[] res= new int[temps.length];

        for(int i=0; i<temps.length; i++ ){
            int t= temps[i];
            while(!stack.isEmpty()&& t> stack.peek()[0]){
                int [] pair= stack.pop();
                res[pair[1]]= i-pair[1];
            }
            stack.push(new int[]{t,i});
        }
        return res;
    }
}
