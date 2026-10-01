import java.util.*;

public class Palindrome {
    static String palindrome(String s) {
        int[] f = new int[26];

        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i) - 'a']++;

        int odd = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            if (f[i] % 2 != 0) {
                odd++;
                mid = (char)('a' + i);
            }
        }

        if (odd > 1)
            return "-1";

        String left = "";

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < f[i] / 2; j++)
                left += (char)('a' + i);
        }

        String right = "";

        for (int i = left.length() - 1; i >= 0; i--)
            right += left.charAt(i);

        return left + mid + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();

        String ans = palindrome(s);

        if (ans.equals("-1"))
            System.out.println("Palindrome not possible");
        else
            System.out.println("Palindrome = " + ans);

        sc.close();
    }
}
