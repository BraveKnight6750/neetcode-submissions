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

   Time Complexity:
    O(n) because it only visits each letter of the string once
  */
  public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);

      if (!Character.isLetterOrDigit(leftChar)) {
        left++;
      } else if (!Character.isLetterOrDigit(rightChar)) {
        right--;
      } else {
        if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
          return false;
        }
        left++;
        right--;
      }
    }
    return true;
  }
}
