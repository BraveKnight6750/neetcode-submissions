class Solution {
  /*
    Given a string s, return true if it is a palindrome, otherwise return false.

    A palindrome is a string that reads the same forward and backward.
    It is also case-insensitive and ignores all non-alphanumeric characters.

    Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
  */

  /*
   Solution:
    A two pointer approach, checking if both left and right are pointing to an Alphanumeric,
    if they are then comparing them, else incrementing/decrementing whichever one isn't pointing to an Alphanumeric
    Similar to submission-1, but uses an array instead of using s.charAt, slightly faster but uses more space,
    and has the same time complexity anyways

   Time Complexity:
    O(n) because it only visits each letter of the string once
  */
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    char[] ar = s.toCharArray();
    int left = 0;
    int right = ar.length - 1;
    while (left < right) {
      char leftChar = ar[left];
      char rightChar = ar[right];

      if (!Character.isLetterOrDigit(leftChar)) {
        left++;
      } else if (!Character.isLetterOrDigit(rightChar)) {
        right--;
      } else {
        if (leftChar != rightChar) {
          return false;
        }
        left++;
        right--;
      }
    }
    return true;
  }
}
