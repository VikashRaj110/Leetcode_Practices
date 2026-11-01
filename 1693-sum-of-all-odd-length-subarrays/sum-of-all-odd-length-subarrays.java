
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Odd-length subarrays starting at i
            int oddRight = (n - i + 1) / 2;

            // Even-length subarrays starting at i
            int evenRight = (n - i) / 2;

            // Current element is the first element
            sum += oddRight * arr[i];

            // Odd left + Even right
            sum += evenRight * ((i + 1) / 2) * arr[i];

            // Even left + Odd right
            sum += oddRight * (i / 2) * arr[i];
        }

        return sum;
    }
}
//  int sum =0;
//         for(int i =0;i<n;i++){
//             int currSum =0;
//             for(int j =i;j<n;j++){
//                 currSum += arr[j];
//               if((j-i+1) %2 == 1){
//                 sum += currSum;
//               }
//             }
            
//         }