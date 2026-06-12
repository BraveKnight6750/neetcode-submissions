class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int num = 1;
            for (int k=0; k < nums.length; k++){
                if (k == i) continue;
                num *= nums[k];
            }
            sol[i] = num;
        }
        return sol;
    }
}  
