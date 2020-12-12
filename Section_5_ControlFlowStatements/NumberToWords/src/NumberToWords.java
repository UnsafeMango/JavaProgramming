public class NumberToWords {
    public static int reverse(int number) {
        int reverse = 0;
        int temp;
        temp = number;
        int remainder;
        while (temp != 0) {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = (reverse * 10) + (remainder);
        }
        return reverse;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int temp = reverse(number);
        int digitCount = getDigitCount(number);
        while (0 != digitCount) {
            digitCount--;
            int temp_remainder = temp % 10;
            temp = temp / 10;

            switch (temp_remainder) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }

        }
        if (reverse(number) == 1) {
            for (int i = 0; i < (digitCount - reverse(number)); i++) {
                System.out.println("Zero");
            }
        }
    }
    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count += 1;

        }
        return count;

    }
}
