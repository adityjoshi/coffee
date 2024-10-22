package recursion.strings;

public class SkipAChar {
    public static void main(String[] args) {
        removeA("baccda");

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
}
