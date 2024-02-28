import java.util.*;

abstract class BankAccount {
    Scanner sc = new Scanner(System.in);
    int accNum;
    String name, mobile;
    int balance = 1000;

    public void inputData() {
        System.out.print("Enter the name of the person: ");
        name = sc.next();
        System.out.print("Enter the phone number of the person: ");
        mobile = sc.next();
        System.out.print("Enter the account number of the person: ");
        accNum = sc.nextInt();
        System.out.print("Enter the balance of the account: ");
        balance = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
    }

    abstract public void deposit();

    abstract public void withdraw();
}

class SavingAccount extends BankAccount {
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Minimum balance should be 1000.");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        int depositAmount = sc.nextInt();
        balance += depositAmount;
        System.out.println("Updated bank balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Minimum balance should be 1000.");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        int depositAmount = sc.nextInt();
        balance += depositAmount;
        System.out.println("Updated bank balance: " + balance);
    }
}

public class bankingabs {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount();
        SavingAccount sa = new SavingAccount();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. To input data");
            System.out.println("2. To show data");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            System.out.println("Select 0 for current account and 1 for savings account");
            int choice2 = sc.nextInt();

            switch (choice) {
                case 1:
                    if (choice2 == 0) {
                        ca.inputData();
                    } else {
                        sa.inputData();
                    }
                    break;
                case 2:
                    if (choice2 == 0) {
                        ca.display();
                    } else {
                        sa.display();
                    }
                    break;
                case 3:
                    if (choice2 == 0) {
                        ca.withdraw();
                    } else {
                        sa.withdraw();
                    }
                    break;

                case 4:
                    if (choice2 == 0) {
                        ca.deposit();
                    } else {
                        sa.deposit();
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
