public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {

        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        for (int i = a; i > 0; i /= 10) {
            for (int j = b; j > 0; j /=10 ) {
                if (i % 10 == j % 10) {
                    return true;
                }
            }
        }
        return false;
    }
}
