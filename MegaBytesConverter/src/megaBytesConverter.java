public class megaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes;
        int remainderKiloBytes;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            megaBytes = kiloBytes / 1024;

            remainderKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }


}
