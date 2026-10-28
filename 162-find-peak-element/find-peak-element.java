

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        if (n == 1) return 0;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }
}




//Brute force
// for(int i =0;i<n;i++){
//          if((i==0|| nums[i]>nums[i-1] ) 
//          &&( i==n-1 || nums[i]>nums[i+1])){
//             ans = i;
//          }
//         }