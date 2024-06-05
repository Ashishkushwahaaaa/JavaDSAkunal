package String;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println((int)'a');
        System.out.println(lp.longestPalindrome("aaacbccd")); // Example usage
    }

    public int longestPalindrome(String s) {
        // There are 26 lowercase and 26 uppercase letters
        // We can use an array of size 52 to count occurrences
        int[] count = new int[52];

        // Fill the count array
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A' + 26]++;
            }
        }

        // Calculate the length of the longest palindrome
        int length = 0;
        boolean oddFound = false;

        for (int c : count) {
            if (c % 2 == 0) {
                length += c;
            } else {
                length += c - 1;
                oddFound = true;
            }
        }

        // Add one if there was any odd character count
        if (oddFound) {
            length += 1;
        }

        return length;
    }

}
