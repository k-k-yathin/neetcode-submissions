class Solution {
    public int trap(int[] height) {
        if(height.length==0)
            return 0;
        
        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty() && height[i]>=height[stack.peek()]){
                int mid = height[stack.pop()];
                if(!stack.isEmpty()){
                    int r = height[i];
                    int l = height[stack.peek()];
                    int h = Math.min(r,l)-mid;
                    int w = i-stack.peek()-1;
                    res += h*w;
                }
            }
            stack.push(i);
        }
        return res;
    }
}
