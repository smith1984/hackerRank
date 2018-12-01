import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        return (sort(a).equals(sort(b)));
    }

    static String sort(String a) {

        char[] charList = a.toUpperCase().toCharArray();

        int size = charList.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < charList.length; j++) {
                if (charList[i] - charList[j] > 0) {
                    char temp = charList[i];
                    charList[i] = charList[j];
                    charList[j] = temp;
                }
            }
        }
        return new String(charList);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}