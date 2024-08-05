package String;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacter {
    public static void main(String[] args) {
        String[] s = {"bella","label","roller"};
        System.out.println(commonChars(s));
    }
    public static List<String> commonChars(String[] words) {
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        for (char c : words[0].toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                s1[c - 'a']++;
            }
        }
        for (int currentWord = 1; currentWord < words.length; currentWord++ ) {
            for (char c : words[currentWord].toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    s2[c - 'a']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                s1[i] = Math.min(s1[i], s2[i]);
                s2[i]=0;
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (s1[i] > 0) {
                for (int j = 0; j < s1[i]; j++) {
                    // char ch = (char)(i + 97);
                    // list.add(String.valueOf(ch));
                    list.add(String.valueOf((char)(i+'a')));
                }
            }
        }
        return list;
    }
}
