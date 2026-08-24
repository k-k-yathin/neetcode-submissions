class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int l=0,r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]>target){
                r--;
            }
            else if(nums[l]+nums[r]<target){
                l++;
            }
            else if(nums[l]+nums[r]==target){
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }
        }
        return arr;
    }
}
