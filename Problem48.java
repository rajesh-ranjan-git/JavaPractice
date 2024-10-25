import java.util.Scanner;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.accountNumber = (long) Math.random() * 1000000;
        this.balance = balance;
    }

    public boolean deposit(double balance) {
        if (balance > 0) {
            this.balance += balance;
            return true;
        } else {
            System.out.println("Invalid deposit, please try again.");
            return false;
        }
    }
    
    public boolean withdraw(double balance) {
        if (balance > 0 && balance <= this.balance) {
            this.balance -= balance;
            return true;
        } else {
            System.out.println("Invalid withdrawl, please try again.");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Open a bank account.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Please deposit some amount to create your account (minimum Rs. 2000) : ");
        double balance;

        do {
            balance = sc.nextDouble();
            if (balance < 2000) {
                System.out.print("Please enter valid amount (minimum Rs. 2000) : ");
            } else {
                break;
            }
        } while (true);

        BankAccount ba1 = new BankAccount(name, balance);
        System.out.println("Congratulations on creating new account!");
        System.out.printf("Current balance : %.2f", ba1.balance);
        System.out.println();

        do {

            System.out.println("Choose your action to perform : ");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");

            int action = sc.nextInt();
            
            if (action == 1) {
                do {
                    System.out.print("Enter amount to deposit : ");
                    double bal = sc.nextDouble();
                    boolean isDepositSuccess = ba1.deposit(bal);

                    if (isDepositSuccess) {
                        System.out.println("Congratulations! Your money has been deposited.");
                        System.out.printf("Current balance : %.2f", ba1.balance);
                        break;
                    }
                } while (true);

                break;
            } else if (action == 2) {
                do {
                    System.out.print("Enter amount to withdraw : ");
                    double bal = sc.nextDouble();
                    boolean isWithdrawlSuccess = ba1.withdraw(bal);

                    if (isWithdrawlSuccess) {
                        System.out.printf("Withdrawn : %.2f", bal);
                        System.out.println();
                        System.out.printf("Current balance : %.2f", ba1.balance);
                        break;
                    }
                } while (true);

                break;
            } else {
                System.out.println("Invalid input, please choose your action again.");
            }
        } while (true);
    }
}