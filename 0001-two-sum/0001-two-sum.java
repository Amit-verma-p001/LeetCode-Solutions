class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int value = 0 ; value < nums.length; value++ ){
            int needValue = target - nums[value];
            if(map.containsKey(needValue)){
                return new int[]{map.get(needValue) , value};
            }
               map.put(nums[value] ,value);
        }
       return new int[]{};
    }
}