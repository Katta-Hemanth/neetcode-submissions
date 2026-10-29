// class Solution {
//     public int longestConsecutive(int[] nums) {

//         HashSet<Integer> set = new HashSet<>();
//         int maxCount = 0;

//         for(int i : nums) {
//             set.add(i);
//         }


//         for(int i=0 ; i<nums.length; i++){
//             int prev = nums[i] - 1;
//             if(!set.contains(prev)) {
//                 int length = 1;
//                 int next = nums[i] + length;
//                 while(set.contains(next)) {
//                     length++;
//                 }

//                 maxCount = Math.max(maxCount, length);
//             }
//         }

//         return maxCount;
        
//     }
// }

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
