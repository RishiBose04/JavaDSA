public class Sentence {
    static String SpaceRmv(String S) {
        String NewString = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ' ') {
                NewString = NewString + S.charAt(i);
            }
        }
        return NewString;
    }

    static int CountWords(String S) {
        int count = 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    static String CountLettersEach(String S) {
        int count = 0;
        String TotalCount = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ' ') {
                count++;
            } else {
                TotalCount = TotalCount + count;
                count = 0;
            }
        }
        TotalCount = TotalCount + count;
        return TotalCount;
    }

    static String ReverseStr(String S) {
        String revstr = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            revstr = revstr + S.charAt(i);
        }
        return revstr;
    }

    static int CountLettersOnly(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    static String nonVowelWord(String s) {
        String[] strArray = s.split(" ");
        String NString = "";
        for (int i = 0; i < strArray.length; i++) {
            boolean hasVowel = false;
            for (int j = 0; j < strArray[i].length(); j++) {
                char c = strArray[i].charAt(j);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i'
                        || c == 'o' || c == 'u') {
                    hasVowel = true;
                    break;
                }
            }
            if (!hasVowel) {
                NString = NString + strArray[i];
            }
        }
        return NString;
    }

    static void CountLetterOccurence(String S) {
        String UniqueAr = "";
        String Count = "";
        String Lowercased = S.toLowerCase();
        for (int i = 0; i < Lowercased.length(); i++) {
            char c = Lowercased.charAt(i);
            if (!UniqueAr.contains(String.valueOf(c)) && c != ' ') {
                UniqueAr = UniqueAr + Lowercased.charAt(i);
            }
        }
        for (int i = 0; i < UniqueAr.length(); i++) {
            int count = 0;
            for (int j = 0; j < S.length(); j++) {
                if (UniqueAr.charAt(i) == Lowercased.charAt(j)) {
                    count++;
                }
            }
            Count = Count + Integer.valueOf(count);
        }
        System.out.println(Count);
    }

    public static void main(String[] args) {
        String s = "India is my country";
        System.out.println(SpaceRmv(s) + "\n");
        System.out.println(CountWords(s) + "\n");
        System.out.println(CountLettersEach(s) + "\n");
        System.out.println(ReverseStr(s) + "\n");
        System.out.println(CountLettersOnly(s) + "\n");
        System.out.println(nonVowelWord(s) + "\n");
        CountLetterOccurence(s);
    }

}