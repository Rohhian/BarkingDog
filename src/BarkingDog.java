public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 8 && hourOfDay >= 0 || hourOfDay == 23) && (barking)) {
            return true;
        } else if (!barking) {
            return false;
        }
        return false;

    }
}
