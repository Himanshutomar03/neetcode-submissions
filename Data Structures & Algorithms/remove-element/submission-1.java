class Solution {
    public int removeElement(int[] nums, int val) {
        int valid_element = 0;
        for(int current : nums){
            if(current != val){
                nums[valid_element] = current;
                valid_element++;
            }
        }
        return valid_element;
        
    }
}