class Solution {
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];
        int prefProduct[] = new int[nums.length];
        int suffixProduct[] = new int[nums.length];

        prefProduct[0] = 1;
        suffixProduct[nums.length - 1] = 1;

        for(int i=1; i<nums.length; i++) {
            prefProduct[i] = prefProduct[i-1] * nums[i-1];
        }

        for(int j=nums.length - 2; j>=0; j--) {
            suffixProduct[j] = suffixProduct[j+1] * nums[j+1];
        }

        for(int i=0; i<nums.length; i++){
            res[i] = prefProduct[i] * suffixProduct[i];
        }
        
        return res;
        
    }
}  
