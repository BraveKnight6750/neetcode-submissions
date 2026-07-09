class Solution {
  /*
    Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
  */

  /*
   Solution:
    Loop through the array using a hashset to track already seen numbers, if already seen return true, if no return in the loop, return false

   Time Complexity:
    O(n), because HashSet has an O(1) contains function so only one operation per element
  */
  public boolean hasDuplicate(int[] nums) {
    // hashset has O(1) time for .contains and .add so best for time complexity for this
    HashSet<Integer> check = new HashSet<Integer>();

    // for loop checks each number in the array and if they are in the hashset then early return
    // false bc its a repeat
    for (int i = 0; i < nums.length; i++) {
      if (check.contains(nums[i])) return true;
      else check.add(nums[i]);
    }
    // return false if loop ended without a duplicate
    return false;
  }
}
