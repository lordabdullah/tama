package tama.address;
import java.io.IOException;

public class index {

    public static String version = new String("Alpha 0.1");



    public static void main(String[] args) {


        Initial_Output(); //calls for initial prompts and testing before starting program
    }

    public static void Initial_Output() {

        System.out.println("\n                                         Tama OS " + version); // statement to display on start of program
        System.out.println("\n                                                <T>"); // statement to display on start of program
        System.out.println("\n           Authors: Abdullah Chaudhry, Kavinath Kanesalingam, Ryan Lawson, Vedha Rajan"); //statement to display Authors
        System.out.println("The following program is confidential and eyes only for the duration of the development period. \n"); //secrecy warning
        System.out.println("G - eneral \nU - nilateral \nN - eurolink \nD - ispersive \nA - utonomic \nM - anuever \n"); //GUNDAM prompt
        System.out.println("Initializing Controllers"); //starting test prompt


        if (Initial_Test()) { //calls Initial Test to begin boot tests
            System.out.println("\n\nCLEAR TO LAUNCH \n"); //if All green, returns true 
        } else {
            System.out.println("WARNING: SOME TESTS HAVE FAILED - NON-CRITICAL."); //any non-critical tests returns false. 
        }

    }

    public static boolean Initial_Test() {

        bluetooth connection = new bluetooth();


        System.out.println("Testing Engine Thresholds");
        System.out.println("Testing Fuel Capacity");
        System.out.println("Testing Power Engagement");
        System.out.println("Releasing Quantum Lock");
        System.out.println("Neurological Link Detected - Standby For Cryo-Bonding");


        try { //calls bluetooth stack for connection
            connection.main(0);
            System.out.println("Neurological Link Successfully Established");
        } catch (IOException e) { //displays errors, if any
            // TODO Auto-generated catch block
            System.out.println("Neurological Link Unsuccessful - Critical");
            e.printStackTrace();

        }

        return true;

    }

}