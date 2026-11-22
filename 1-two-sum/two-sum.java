class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        //1.Bruth Force
        // for(int i =0;i<n-1;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[i]+nums[j]== target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        //    return new int[]{}; 

        // 2.HashMap  map{key,index}
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<n;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int [] {map.get(complement),i};
            }
            else{
                map.put(nums[i],i);
            }
        }

         return new int [] {};
    }
  
}
    