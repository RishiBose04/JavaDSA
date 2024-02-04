import java.util.Scanner;

class HelloWorld {

    static char NextAlpha(char ch) {
        if (ch == 'Z' || ch == 'z')
            return (char) (ch - 25);
        return (char) (ch + 1);
    }

    static char SameAlpha(char ch) {
        return (char) (ch);
    }

    static char LastAlpha(char ch) {
        if (ch == 'A' || ch == 'a') {
            return (char) (ch + 25);
        }
        return (char) (ch - 1);
    }

    static char SmallAlpha(char ch) {

        return (char) (ch + 32);
    }

    static char BigAlpha(char ch) {
        return (char) (ch - 32);
    }

    static char BTodAlpha(char ch) {
        return (char) (ch + 34);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        System.out.println(SameAlpha(c));
        System.out.println(NextAlpha(c));
        System.out.println(LastAlpha(c));
        System.out.println(SmallAlpha(c));
        System.out.println(BigAlpha(c));
        System.out.println(BTodAlpha(c));
    }
}
