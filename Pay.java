import java.util.Scanner;

public class Pay {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Identifier declarations
        double hours;  // Number of hours worked
        double rate;   // Hourly pay rate
        double pay;    // Gross pay

        // Display prompt for user to input number of hours worked
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();

        // Display prompt for user to input hourly pay rate
        System.out.print("How much are you paid per hour? ");
        rate = keyboard.nextDouble();

        // Perform the calculations
        if (hours <= 40) {
            // Calculate pay for regular hours (40 hours or less)
            pay = hours * rate;
        } else {
            // Calculate regular pay for first 40 hours
            double regularPay = 40 * rate;
            // Calculate overtime hours
            double overtimeHours = hours - 40;
            // Calculate overtime pay (1.5 times the hourly rate for each overtime hour)
            double overtimePay = overtimeHours * 1.5 * rate;
            // Calculate total pay including regular and overtime pay
            pay = regularPay + overtimePay;
        }

        // Display the total pay earned by the user
        System.out.println("You earned $" + pay);
    }
}