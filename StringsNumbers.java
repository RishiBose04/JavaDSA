import java.util.*;

public class Main {

    static String mixIn(int x, String S) {
        String n = String.valueOf(x);
        String ans = "";
        for (int i = 0; i < (n.length() + S.length()); i++) {
            if (i % 2 == 0 || i == 0) {
                ans = ans + n.charAt(i / 2);
            } else {
                ans = ans + S.charAt((i - 1) / 2);
            }
        }
        return ans;
    }

    static String mix(int x, String S) {
        String S1 = String.valueOf(x);
        String S2 = S1 + S;
        return S2;
    }

    public static String odd(int n, String s) {
        String nums = "" + n;
        String ans = "";

        for (int i = 0; i < nums.length(); i++) {
            if ((int) nums.charAt(i) % 2 != 0) {
                ans = ans + nums.charAt(i);
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if (j % 2 != 0) {
                ans = ans + s.charAt(j);
            }
        }

        return ans;
    }

    public static String even(int n, String s) {
        String nums = "" + n;
        String ans = "";

        for (int i = 0; i < nums.length(); i++) {
            if ((int) nums.charAt(i) % 2 == 0) {
                ans = ans + nums.charAt(i);
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if (j % 2 == 0) {
                ans = ans + s.charAt(j);
            }
        }

        return ans;
    }

    static String First2(int X, String S) {
        String New = "" + X;
        String Str = "";
        for (int i = 0; i < 2; i++) {
            Str = Str + New.charAt(i);
        }

        for (int i = 0; i < 2; i++) {
            Str = Str + S.charAt(i);
        }
        return Str;
    }

    static String Last2(int X, String S) {
        String New = "" + X;
        String Str = "";
        for (int i = New.length() - 2; i <= New.length() - 1; i++) {
            Str = Str + New.charAt(i);
        }
        for (int i = S.length() - 2; i <= S.length() - 1; i++) {
            Str = Str + S.charAt(i);
        }
        return Str;
    }

    public static void main(String[] args) {
        int a = 1234;
        String str = "RIT";
        System.out.println(mixIn(a, str));
        System.out.println(mix(a, str));
        System.out.println(odd(a, str));
        System.out.println(even(a, str));
        System.out.println(First2(a, str));
        System.out.println(Last2(a, str));
    }
}