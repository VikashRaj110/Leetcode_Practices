class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int c1 = 0;
        int c2 = 0;
    // optimal creater boolean array
     boolean [] arr1 = new boolean[1001];
     boolean [] arr2 = new boolean[1001];

      for(int num:nums1){
        arr1[num] = true;
      }
      for(int num:nums2){
        arr2[num] = true;
      }
      for(int num:nums1){
        if(arr2[num]){
            c1++;
        }
      }
     for(int num:nums2){
        if(arr1[num]){
            c2++;
        }
      }

      int[] count = {c1, c2};
      return count;
    }
}

// for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (nums1[i] == nums2[j]) {
//                     c1++;
//                     break; // Count this element only once
//                 }
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (nums2[i] == nums1[j]) {
//                     c2++;
//                     break; 
//                 }
//             }
//         }