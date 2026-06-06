class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftarr[] = leftArray(nums);
        int rightarr[] = rightArray(nums);
        for(int i = 0; i<nums.length;i++){
            nums[i] = leftarr[i] * rightarr[i];
        }
        return nums;
    }
    public int[] leftArray(int arr[]){
        int leftArr[] = new int[arr.length];
        leftArr[0] = 1;
        for (int i = 1;i < arr.length;i++){
            int left = leftArr[i-1] * arr[i-1];
            leftArr[i] = left;
        }
        return leftArr;
        
    }
    public int[] rightArray(int arr[]){
        int rightArr[] = new int[arr.length];
        rightArr[arr.length-1] = 1;
        for (int i = arr.length - 2;i >= 0;i--){
            int right = rightArr[i+1] * arr[i+1];
            rightArr[i] = right;
        }
        return rightArr;
        
    }
}