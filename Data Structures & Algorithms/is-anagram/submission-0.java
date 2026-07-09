class Solution {
  /*
    Given two strings s and t, return true if the two strings are anagrams of each other,
    otherwise return false.

    An anagram is a string that contains the exact same characters as another string,
    but the order of the characters can be different.
  */

  /*
   Solution:
    Turn the strings into arrays, sort, and check if they are equal. Works because anagrams when aranged in alphabetical order are always equal

   Time Complexity:
    O(n * log(n) + m * log(m)) where m is the length of s and n is the length of t,
    because it runs a sort for both which is n * log(n) for each added up
  */
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length) {
      return false;
    }

    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
  }
}
