
public class FirstUniqueCharacterInAString {
    static int firstuniquecharacter(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            freq[c - 'a']++;

        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstuniquecharacter("leetcode"));
    }
}

/*
 * What does this program do?
 * 
 * It finds the index (position) of the first character in a string that does
 * not repeat.
 * Example:
 * 
 * "leetcode" → 'l' appears once, so it returns 0.
 * 
 * "loveleetcode" → 'v' is the first unique, at index 2.
 * 
 * 
 * freq is an array of size 26 to store how many times each lowercase letter
 * (a-z) appears.
 * 
 * Example: if s = "leetcode", then:
 * 
 * 'l' → index 11 → freq[11] = 1
 * 
 * 'e' → index 4 → freq[4] = 3 (since e appears 3 times)
 * 
 * char[] chars = s.toCharArray();
 * Converts the string into a character array so we can loop through letters
 * easily.
 * 
 * "leetcode" → [l, e, e, t, c, o, d, e]
 * 
 * 
 * for (char c : chars) {
 * freq[c - 'a']++;
 * }
 * Loops through each character, and counts it.
 * 
 * c - 'a' gives the position in the alphabet.
 * 
 * Example: 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25.
 * 
 * So 'l' maps to index 11, 'e' maps to index 4, etc.
 * 
 * for (int i = 0; i < chars.length; i++) {
 * if (freq[chars[i] - 'a'] == 1) {
 * return i;
 * }
 * }
 * Go through the string again.
 * 
 * If a character’s count in freq[] is 1, it means this character is unique.
 * 
 * Return its index immediately.
 * 
 * java
 * Copy code
 * return -1;
 * }
 * If no unique character is found, return -1
 */
