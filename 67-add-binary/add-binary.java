class Solution {
    public String addBinary(String a, String b) {

        StringBuilder ans = new StringBuilder();

        // Start from the last index of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        // Continue until both strings and carry are finished
        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            // Add digit from string a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add digit from string b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Get current binary digit (0 or 1)
            ans.append(sum % 2);

            // Calculate carry for next position
            carry = sum / 2;
        }

        // Reverse because we added digits from right to left
        return ans.reverse().toString();
    }
}