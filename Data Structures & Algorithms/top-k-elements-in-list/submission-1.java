class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> numfreq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numfreq.put(nums[i], numfreq.getOrDefault(nums[i],0) +1);
        }

        List <Map.Entry<Integer, Integer>> list = new ArrayList<>(numfreq.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());
        int[] result = new int[k];
        int index =0;

        for(Map.Entry<Integer,Integer>entry : list){
            if (index ==k)break;
            result[index++] = entry.getKey();
        }
        return result;
    }
}
