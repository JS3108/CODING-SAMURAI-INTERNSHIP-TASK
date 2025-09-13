package atm;
import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0; // Starting balance 
        int choice;

        System.out.println("Welcome to the ATM Banking System");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: ₹" + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful. New balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient funds or invalid amount!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
