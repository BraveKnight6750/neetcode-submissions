class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums){
            numSet.add(num);
        }

        int max = 0;

        for (int num : numSet){
            if (!numSet.contains(num-1)){
                int len = 1;
                while (numSet.contains(num + len)){
                    len++;
                }
                max = max > len ? max : len;
            }
        }
        return max;
    }
}
