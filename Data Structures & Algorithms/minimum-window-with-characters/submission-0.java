class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int[] count = new int[128];

        for(char c : t.toCharArray()){
            count[c]++;
        }
        int left=0;
        int have=0;
        int need = t.length();

        int minLen = Integer.MAX_VALUE;
        int start =0;

        for(int right =0;right<s.length();right++){
            char c = s.charAt(right);
            count[c]--;

            if(count[c]>=0){
                have++;
            }
            while(have == need){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                count[leftChar]++;
                if (count[leftChar] > 0) {
                    have--;
                }
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start + minLen);
    }
}
