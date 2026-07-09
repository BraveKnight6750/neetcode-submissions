class Solution {
  /*
    Given an array of strings strs, group all anagrams together into sublists.
    You may return the output in any order.
    An anagram is a string that contains the exact same characters as another string,
    but the order of the characters can be different.
  */

  /*
   Solution:
    Iterate through the array, sort each word into alphabetical order, then use that as a key in a hashmap to
    store an array list that will track the original

   Time complexity:
    O(m * n * log(n)) where m is # of strings and n is length of the longest string
    Because: for loop of each string means minimum time complexity M, plus in each loop sort is called on each string which is n log n,
    so m loops times n log n for the operations of each loop means O(m * n * log(n))
  */

  public List<List<String>> groupAnagrams(String[] strs) {
    // null check
    if (strs == null || strs.length == 0) {
      return new ArrayList<>();
    }

    // map to store the data
    HashMap<String, List<String>> map = new HashMap<>();

    // iterate through the array
    for (String s : strs) {
      // turn each string in the list into a char array to sort then back into a string as a key
      char[] charAr = s.toCharArray();
      Arrays.sort(charAr);
      String key = new String(charAr);

      /* check if the map has the key and if not put an empty arraylist in the map
      works because each word is automatically "sorted" (in alphabetical order),
      so all anagrams will have the same key */
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      // put the unsorted anagram into the array list for its sorted key
      map.get(key).add(s);
    }

    // make an arraylist to wrap around all the arraylists of anagrams
    return new ArrayList<>(map.values());
  }
}
