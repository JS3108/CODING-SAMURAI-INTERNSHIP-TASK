package atm;
import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0; //hardcoded balance
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
                    
                case 2: //deposit
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) { //deposit only if amt is greater than 0
                        balance += deposit;
                        System.out.println("Deposit successful. New balance: ₹" + balance);
                    } else { //do not accept negative amount
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 3: //withdraw
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {//withdraw only if balance is sufficient
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: ₹" + balance);
                    } else { //deny if balance insufficient
                        System.out.println("Insufficient funds or invalid amount!");
                    }
                    break;
                    
                case 4://exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
