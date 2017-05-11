import java.io.IOException;

public class index {

    public static String version = new String("Alpha 0.1");



    public static void main(String[] args) {

        bluetooth connection = new bluetooth();

        Initial_Output();

        try {
            connection.main(0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void Initial_Output() {

        System.out.println("\n                                   Tama OS " + version); // statement to display on start of program
        System.out.println("\nAuthors: Abdullah Chaudhry, Kavinath Kanesalingam, Ryan Lawson, Vedha Rajan"); //statement to display Authors
        System.out.println("The following program is confidential and eyes only for the duration of the development period. \n"); //warning
        System.out.println("G - eneral \nU - nilateral \nN - eurolink \nD - ispersive \nA - utonomic \nM - anuever \n");
        System.out.println("Initializing Controllers");


        if (Initial_Test()) {
            System.out.println("\n\nCLEAR TO LAUNCH \n");
        } else {
            System.out.println("WARNING: SOME TESTS HAVE FAILED - NON-CRITICAL.");
        }

    }

    public static boolean Initial_Test() {

        System.out.println("Testing Engine Thresholds");
        System.out.println("Testing Fuel Capacity");
        System.out.println("Testing Power Engagement");
        System.out.println("Releasing Quantum Lock");
        System.out.println("Neurological Link Detected - Standby For Cryo-Bonding");
        System.out.println("Neurological Link Successfully Bonded");

        return true;

    }



}