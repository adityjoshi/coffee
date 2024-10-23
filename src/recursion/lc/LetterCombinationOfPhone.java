package recursion.lc;

import java.util.List;

public class LetterCombinationOfPhone {
    public static void main(String[] args) {
        pad("","23");
    }

    static void pad(String p , String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
      int digit =  up.charAt(0) - '0';
        String[] mappings = {
                "",    // 0 (no mapping)
                "",    // 1 (no mapping)
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs",// 7
                "tuv", // 8
                "wxyz" // 9
        };
        String letters = mappings[digit];
        for (int i = 0; i < letters.length(); i++) {
             char ch = letters.charAt(i);
            pad(p+ch,up.substring(1));
        }
    }
}
