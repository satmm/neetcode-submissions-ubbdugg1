class Solution {
    public boolean isPalindrome(String s) {
        String string1 = s.toLowerCase();
        char strarr[] = string1.toCharArray();
        char specialChar[] = {'?','@','%','+'};
        int start = 0;
        int end = strarr.length-1;
        while(start <= end){

            // madam
            if (!Character.isLetterOrDigit(strarr[start])) { start++; continue; }
            if (!Character.isLetterOrDigit(strarr[end])) { end--; continue; }
            if (strarr[start] != strarr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
