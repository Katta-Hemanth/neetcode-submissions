class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int k = 0 ;k< nums.length ; k++) {
            map.put(nums[k], k);
        }

        for (int i = 0; i<nums.length; i++){
            int check = target - nums[i];
            if(map.containsKey(check) && map.get(check) != i) {
                return new int[] {i, map.get(check)};
            }
        }

        return new int[0];

    }   
}
