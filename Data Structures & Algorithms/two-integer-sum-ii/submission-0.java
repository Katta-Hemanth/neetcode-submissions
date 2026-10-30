class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while(l < r) {
            int check = numbers[l] + numbers[r];

            if(check < target) {
                l++;
            } else if(check > target) {
                r--;
            }else {
                return new int[] {l+1, r+1};
            }
            
        }

        return new int[0];
    }
}
