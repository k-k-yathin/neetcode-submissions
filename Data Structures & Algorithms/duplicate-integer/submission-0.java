class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}