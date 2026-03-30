class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsarray = new HashSet<>();

        for(int i=0; i< nums.length; i++){
            if (numsarray.contains(nums[i]))
                return true;
            else
                numsarray.add(nums[i]);
        }
        return false;
    }
}