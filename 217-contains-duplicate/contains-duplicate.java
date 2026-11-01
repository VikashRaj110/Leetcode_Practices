class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n =nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}

    //  if(n==1){
    //         return false;
    //     }
    //     int s=0;
    //     int e = n-1;
    //     while(s<=e){
    //      if(nums[s]==nums[e]){
    //         return true;
        
    //      }
    //      s++;
    //      e--;
    //     }