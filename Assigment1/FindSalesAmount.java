
// import javax.swing.JOptionPane;
import java.util.Scanner;

public class FindSalesAmount {
    public static void main(final String[] Args) {
        final Scanner user_input = new Scanner(System.in);
        System.out.print("Enter desired commission: $");

        final double commissionS = user_input.nextDouble();
        user_input.close();

        final double desiredCommission = commissionS;
        double salesAmount = 0;
        double commissionRate = 0;
        double commissionAmount = 0;
        System.out.println("Sales Amount" + "\t\t" + "Commission");

        for (salesAmount = 1; salesAmount >= commissionAmount; salesAmount++) {
            if (salesAmount <= 5000) {
                commissionRate = 0.08;
            }
            if (salesAmount >= 5001 && salesAmount <= 10000) {
                commissionRate = 0.10;
            }
            if (salesAmount >= 10000) {
                commissionRate = 0.12;
            }
            salesAmount += 4999;
            commissionAmount = salesAmount * commissionRate;
            System.out.println(salesAmount + "\t\t\t" + commissionAmount);
            if (commissionAmount >= desiredCommission) {
                break;
            }
        }
        System.out.println("To earn a commission of $" + desiredCommission + " You must sell $" + salesAmount);
    }
}