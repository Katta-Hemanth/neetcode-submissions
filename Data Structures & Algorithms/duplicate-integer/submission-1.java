class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for(int i=0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // }

        // return set.size() < nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< nums.length ; i++) {
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i], 1);
        }

        return false;
    }
}