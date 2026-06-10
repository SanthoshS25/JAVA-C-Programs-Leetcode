class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int ele : nums1) {
            set1.add(ele);
        }
        for (int ele : nums2) {
            set2.add(ele);
        }
        for (int ele : set2) {
            if (set1.contains(ele)) {
                list.add(ele);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}