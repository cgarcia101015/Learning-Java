public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (((hourOfDay < 8) && (hourOfDay >= 0)) && barking || (hourOfDay == 23) && barking == true) {
            return true;
        } else {
            return false;
        }
    }
}