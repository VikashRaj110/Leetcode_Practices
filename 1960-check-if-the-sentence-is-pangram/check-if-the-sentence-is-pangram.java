class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] arr = new boolean[26];
        for(int i =0;i<sentence.length();i++){
          arr[sentence.charAt(i)-'a'] = true;
        }
        for(boolean curr:arr){
            if(!curr){
                return false;
            }
        }
          return true;  
        }
}

// Set<Character> set = new HashSet();
//  for(int i =0;i<s.length();i++){
//     set.add(s.charAt(i));
//  }
//  return set.size();