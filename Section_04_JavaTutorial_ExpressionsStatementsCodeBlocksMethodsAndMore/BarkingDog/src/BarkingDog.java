public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if ((barking == true) && (hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23)) {
            return true;
        } else if (hourOfDay < 0 ||  hourOfDay > 23) {
            return false;
        } else {
            return false;
        }
    }
}
