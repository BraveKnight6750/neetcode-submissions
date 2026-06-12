class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i : nums){
          
            frequency.put(i, frequency.getOrDefault(i,0) + 1);
        }
        int[] sol = new int[k];
        for (int i = 0; i < k; i++){
            int mostFrequentElement = -1;
            int maxCount = -1;

            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentElement = entry.getKey();
                }
            }

            sol[i] = mostFrequentElement;
            frequency.remove(mostFrequentElement);
        }
        return sol;
    }
}
