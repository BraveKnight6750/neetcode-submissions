class Solution {
  /*
    Given two strings s and t, return true if the two strings are anagrams of each other,
    otherwise return false.

    An anagram is a string that contains the exact same characters as another string,
    but the order of the characters can be different.
  */

  /*
   Solution:
    Put the amount of each character in a hashmap, if the strings are anagrams they will
    have the same number of each character

   Time Complexity:
    O(m + n) where m is the length of s and n is the length of t because you only have to
    iterate through both strings then do an equals check
  */
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> sMap = new HashMap<>();
    HashMap<Character, Integer> tMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
      tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
    }

    return sMap.equals(tMap);
  }
}
