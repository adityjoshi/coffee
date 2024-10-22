package recursion.strings;

public class SkipAChar {
    public static void main(String[] args) {
      skip("","baccad");

    }
    static void removeA(String word) {
        char [] arr = word.toCharArray();
        String text = "";
        for (int i = 0 ; i< arr.length;i ++) {
            if (arr[i] == 'a') {
               text += "";
            } else {
                text += arr[i];
            }
        }
        System.out.println(text);
    }
    /*
    recurive approach
    -> take two pointer one will count the new string other will check the given string
       if we stumble upon a just ignore and move the pointer.
     */

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char word = up.charAt(0);
        if (word == 'a') {
            skip(p,up.substring(1));
        } else {
            skip(p + word,up.substring(1));
        }
    }
}
