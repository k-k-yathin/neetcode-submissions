class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        int left = 0;

        for(int right=0;right<nums.length;right++){
            while(!deque.isEmpty() && deque.peekFirst() < left){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]){
                deque.removeLast();
            }
            deque.addLast(right);

            if(right-left+1 == k){
                ans[left] = nums[deque.peekFirst()];
                left++;
            }
        }
        return ans;
    }
}