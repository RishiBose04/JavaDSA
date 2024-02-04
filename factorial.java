// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class HelloWorld {
    static void fact(int x) {
        int count = 0;
        int evencount = 0;
        int oddcount = 0;
        for (int i = 1; i <= x; ++i) {
            if (x % i == 0 && i % 2 == 0) {
                count++;
                evencount++;
            } else if (x % i == 0 && i % 2 != 0) {
                count++;
                oddcount++;
            }
        }
        System.out.println(count);
        System.out.println(evencount);
        System.out.println(oddcount);
        GCD(evencount, oddcount);
    }

    static void GCD(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; ++i) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        int a = 8;
        fact(a);
    }
}