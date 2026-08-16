class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> result = new ArrayList<>();


        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0) + 1);
        }
        for(int key : mp.keySet()){
            if(mp.get(key) > nums.length/3){
                result.add(key);
            }
        }
        return result;
        
    }
}