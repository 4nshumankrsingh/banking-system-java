import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        int option = 0;
        double balance = 5.545;
        double deposit;
        double withdraw;
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("**************");
            System.out.println("BANKING SYSTEM");
            System.out.println("**************");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**************");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            
            switch(option) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
        }
        
        }
        System.out.println("**************");
        System.out.println("YOU'VE BEEN EXITED");
        System.out.println("**************");


        scanner.close();

    }
    static double showBalance(double balance) {
        System.out.println("**************");
        System.out.printf("₹%.2f\n", balance);
        return 0;
    }
    static double deposit() {
        double amount;
        System.out.println("**************");
        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }


    }
    static double withdraw(double balance) {
        double amount;
        System.out.println("**************");
        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("**************");
            System.out.println("Amount can't be negative");
            return 0;
            
        }
        else if(amount > balance) {
            System.out.println("**************");
            System.out.println("Insufficient Funds -- Amount exceeding the balance");
            return 0;
        }
        else {
            return amount;
        }
    }
}