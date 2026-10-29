class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;

        for(int i : nums) {
            set.add(i);
        }


        for(int num : set){
            int prev = num - 1;
            if(!set.contains(prev)) {
                int length = 1;
   
                while(set.contains(num + length)) {
                    length++;
                }

                maxCount = Math.max(maxCount, length);
            }
        }

        return maxCount;
        
    }
}
