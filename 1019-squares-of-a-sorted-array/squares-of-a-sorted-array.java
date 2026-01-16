class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int product;
        for(int i = 0; i < nums.length; i++){
            product = nums[i] * nums[i];
            arr[i] = product;
        }
        Arrays.sort(arr);
        return arr;
        
    }
}