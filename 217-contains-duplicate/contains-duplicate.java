class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int i = 0;
        // for(int j = 1;j<nums.length;j++ ){
        //     if(nums[i] == nums[j]){
        //         return true;
        //     }
        //     i++;
        // }
        HashSet <Integer> set = new HashSet<>();
        for(int element : nums){
            set.add(element);
        }
        if((nums.length) == set.size()) return false;
        return true;
    }
}