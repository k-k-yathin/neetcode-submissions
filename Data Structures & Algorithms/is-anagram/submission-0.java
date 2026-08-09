class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        if(Arrays.equals(chars1,chars2)){
            return true;
        }
        return false;
    }
}
