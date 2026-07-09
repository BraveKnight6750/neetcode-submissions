class Solution {
  /*
    Given a string s, return true if it is a palindrome, otherwise return false.

    A palindrome is a string that reads the same forward and backward.
    It is also case-insensitive and ignores all non-alphanumeric characters.

    Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
  */

  /*
   Solution:
    Make an ArrayList holding only the alphanumeric characters in s, then for each character in the ArrayList,
    check if it is equal to the character equidistant from the end that it is from the beginning

   Time Complexity:
    O(n + n/2) which is just O(n), the n comes from iterating through the string to filter for each character,
    n/2 to iterate through half the ArrayList to check if the characters match
  */
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    char orig[] = s.toCharArray();
    ArrayList<Character> ar = new ArrayList<>();
    for (char c : orig) {
      if (("" + c).matches("^[a-zA-Z0-9]+$")) {
        ar.add(c);
      }
    }

    for (int i = 0; i < ar.size() / 2; i++) {
      if (ar.get(i) != ar.get(ar.size() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
