class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer,Integer> mp = new HashMap<>();
        

        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(int key: mp.keySet()){
            int freq = mp.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >=0 && index < k;i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[index++] = num;
                }
            }
        }
        return result;
        
        
    }
}
