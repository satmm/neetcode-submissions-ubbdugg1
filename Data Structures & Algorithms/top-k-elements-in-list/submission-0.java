

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> numsfreq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numsfreq.put(nums[i], numsfreq.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Convert to list for sorting
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numsfreq.entrySet());

        // Step 3: Sort by frequency (descending)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Take top k elements
        int[] result = new int[k];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : list) {
            if (index == k) break;
            result[index++] = entry.getKey();
        }

        return result;
    }
}