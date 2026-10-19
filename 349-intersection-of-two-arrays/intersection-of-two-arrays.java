class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        } 
        int [] result = new int[Math.min(n,m)];
        int k =0;
        for(int num:s1){
            if(s2.contains(num)){
                result[k++] = num;
            }
        }
        return Arrays.copyOf(result, k);
    }
}