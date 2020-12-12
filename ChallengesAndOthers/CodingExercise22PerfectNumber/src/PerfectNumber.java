public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number <= 0) {
            return false;
        }
        int perfectCheck = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfectCheck += i;
            }
        }
        return number == perfectCheck;
    }
}
