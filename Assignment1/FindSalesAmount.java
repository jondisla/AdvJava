
//bring in the scanner utility
import java.util.Scanner;

public class FindSalesAmount {
    public static void main(final String[] Args) {
        // begin user input and store it in user_input final
        final Scanner user_input = new Scanner(System.in);
        // Ask the user the desired commission
        System.out.print("Enter desired commission amount: $");
        // Store the input in a commission final
        final double commission = user_input.nextDouble();
        // end or close the scanner
        user_input.close();
        // re-assign the commission in order to break
        final double commissionDesired = commission;
        double amountSales = 0;
        double rateCommission = 0;
        double amountCommission = 0;
        // Create the table
        System.out.println("Sales Amount" + "\t\t" + "Commission");

        for (amountSales = 1; amountSales >= amountCommission; amountSales++) {
            /*
             * if the amountSales is less than or equal to 5000 The rate of commission is
             * 0.08
             */
            if (amountSales <= 5000) {
                rateCommission = 0.08;
            }
            /*
             * if the amountSales is greater than or equal to 5001 The rate of commission is
             * 0.10
             */
            if (amountSales >= 5001 && amountSales <= 10000) {
                rateCommission = 0.10;
            }
            /*
             * if the amountSales is greater than or equal to 10000 The rate of commission
             * is 0.012
             */
            if (amountSales >= 10000) {
                rateCommission = 0.12;
            }
            // add and assign 4999 to the sales amount
            amountSales += 4999;
            // calculate the commission by multiplying the sales by the commission rate
            amountCommission = amountSales * rateCommission;
            System.out.println(amountSales + "\t\t\t" + amountCommission);
            // check if the commission amount is greater than or equal to the desired
            // commission and if so, stop the for loop
            if (amountCommission >= commissionDesired) {
                break;
            }
        }
        System.out.println("To earn a commission of $" + commissionDesired + " You must sell $" + amountSales);
    }
}