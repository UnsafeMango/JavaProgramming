public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstBoolean, double secondBoolean) {
        return (int) (firstBoolean * 1000) == (int) (secondBoolean * 1000);
    }
}
