// Import libraries
package conversion_pesos;
import java.util.Scanner;

/**
 * Main class
 *
 */
public class App
{
    /**
     * Main function
     * @param args
     */
    public static void main( String[] args )
    {
        // Define variables
        Scanner input = new Scanner(System.in);
        double mass;

        // Get user data
        System.out.println("-------------------------------------------------------");
        System.out.println("| Digite la masa del objeto (gramos)");
        System.out.println("-------------------------------------------------------");
        mass = input.nextDouble();

        // Print
        System.out.println("-------------------------------------------------------");
        System.out.println("| El objeto pesa " + convertToKG(mass) + " Kg");
        System.out.println("| El objeto pesa " + convertToLb(mass) + " Lb");
        System.out.println("| El objeto pesa " + convertToOz(mass) + " Oz");
        System.out.println("-------------------------------------------------------");
    }   


    /**
     * Method to convert gr to Kg
     * @param mass
     * @return double
     */
    private static double convertToKG(double mass) {
        // Return
        return mass / 1000;
    }


    /**
     * Method to convert gr to Lb
     * @param mass
     * @return double
     */
    private static double convertToLb(double mass) {
        // Return
        return mass / 453.49;
    }

    
    /**
     * Method to convert gr to Oz
     * @param mass
     * @return double
     */
    private static double convertToOz(double mass) {
        // Return
        return mass * 0.03527396195;
    }
}
