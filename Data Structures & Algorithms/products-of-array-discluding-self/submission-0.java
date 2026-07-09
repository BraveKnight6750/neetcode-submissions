class Solution {
  /*
    Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

    Each product is guaranteed to fit in a 32-bit integer.
  */

  /*
   Solution:
    Brute force, iterate through the whole array and for each number iterate through the rest of the array,
    multiplying all numbers together except the one at the current index

   Time Complexity:
    O(n^2), because it iterates through the whole array O(n) and then inside of each of those iterations iterates through the whole array again
  */

  public int[] productExceptSelf(int[] nums) {
    int[] sol = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int num = 1;
      for (int k = 0; k < nums.length; k++) {
        if (k == i) continue;
        num *= nums[k];
      }
      sol[i] = num;
    }
    return sol;
  }
}
