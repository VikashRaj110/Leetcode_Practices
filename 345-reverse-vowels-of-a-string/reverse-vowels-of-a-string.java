
class Solution {

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' || ch == 'A' ||
            ch == 'E' || ch == 'I' || ch == 'O' ||
            ch == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();

        int s = 0;
        int e = n - 1;

        while (s < e) {

            if (!isVowel(ch[s])) {
                s++;
            }
            else if (!isVowel(ch[e])) {
                e--;
            }
            else {
                // Swap vowels
                char temp = ch[s];
                ch[s] = ch[e];
                ch[e] = temp;

                s++;
                e--;
            }
        }
///String.valueOf(ch);
        return new String(ch);
    }
}
