class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        // Bruth force
        // char[] ch1 = s.toCharArray();
        // char[] ch2 = t.toCharArray();

        // Arrays.sort(ch1);
        // Arrays.sort(ch2);
        // return Arrays.equals(ch1,ch2);

       // Frequency Array
       int [] freq= new int[26];

       for(char ch :s.toCharArray())
              freq[ch-97]++;
            for(char ch :t.toCharArray())
             freq[ch-97]--;

            for(int val: freq){
            if(val!=0) return false;
            }    
           return true;      
    }
}

