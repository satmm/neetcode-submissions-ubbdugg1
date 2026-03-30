class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int values : freq.values()){
            if (values >1){
                return true;
            }
        }

        return false;
    }
}
