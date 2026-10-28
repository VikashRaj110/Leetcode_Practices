class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
          int ans =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            // m right side m hu answe right side m h
            if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                // answer left side m mil gya right or check kar lete h
            ans = mid;
              e = mid-1;
            }
        }
         return ans;
    }
}