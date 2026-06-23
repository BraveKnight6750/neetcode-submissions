class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] ar = s.toCharArray();
        int left = 0;
        int right = ar.length -1;
        while (left < right){
            char leftChar = ar[left];
            char rightChar = ar[right];

            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            } 

            else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            
            else {
                if (leftChar != rightChar){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
