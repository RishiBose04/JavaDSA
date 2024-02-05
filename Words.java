// Palindrome of words
class Palindrome {
    static void IsPalindrome(String S) {
        String reverse = "";
        for (int i = S.length() - 1; i >= 0; --i) {
            reverse = reverse + S.charAt(i);
        }
        if (S.equals(reverse)) {
            System.out.println("Palindrome\n");
        } else
            System.out.println("Not Palindrome");
    }

    static void Formatting(String S) {
        String NewString = "";
        for (int i = 0; i < S.length(); i++) {
            if (i == 0)
                NewString = NewString + S.charAt(i);
            else
                NewString = NewString + S.toLowerCase().charAt(i);
        }
        System.out.println(NewString + "\n");
    }

    static void Reverse(String S) {
        String Reverse = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            Reverse = Reverse + S.charAt(i);
        }
        System.out.println(Reverse + "\n");
    }

    static void UniqueChar(String S) {
        String TS = "";

        for (int i = 0; i < S.length(); i++) {
            if (!TS.contains(String.valueOf(S.charAt(i)))) {
                TS = TS + S.charAt(i);
            }
        }
        System.out.println(TS);
    }

    static void VowelRMV(String S) {
        String ns = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != 'A' && S.charAt(i) != 'E' && S.charAt(i) != 'I' && S.charAt(i) != 'O'
                    && S.charAt(i) != 'U' && S.charAt(i) != 'a' && S.charAt(i) != 'e' && S.charAt(i) != 'i'
                    && S.charAt(i) != 'o' && S.charAt(i) != 'u') {
                ns = ns + S.charAt(i);
            }
        }
        System.out.println(ns + "\n");
    }

    static void NextCharEach(String S) {
        String UpdatedString = "";
        for (int i = 0; i < S.length(); i++) {
            UpdatedString = UpdatedString + S.charAt(i) + 1;
        }
        System.out.println((UpdatedString));
    }

    public static void main(String[] args) {
        String Str = "APPA";
        String Str2 = "RIT";
        IsPalindrome(Str);
        Formatting(Str);
        Reverse(Str2);
        UniqueChar(Str);
        VowelRMV(Str2);
        NextCharEach(Str);
    }
}