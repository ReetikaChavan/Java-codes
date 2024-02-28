import java.util.Scanner;

interface RBI {
    int MINS_INTEREST = 4;
    int MINC_INTEREST = 2;

    void calculateInterest();
}

abstract class BankAccount {
    Scanner sc = new Scanner(System.in);
    int accno;
    double balance;
    String rName, city;
    int deposit;

    void inputdata() {
        System.out.println("Enter the Account number:");
        accno = sc.nextInt();
        System.out.println("Enter city name:");
        city = sc.next();
        System.out.println("Enter name:");
        rName = sc.next();
        System.out.println("Enter the Account balance:");
        this.balance = this.balance + sc.nextInt();
    }

    void display() {
        System.out.println("The account number is: " + accno);
        System.out.println("The account customer name is: " + rName);
        System.out.println("The customer balance is: " + this.balance);
    }

    abstract void deposit();

    abstract void withDraw();
}

class SavingsAccount extends BankAccount implements RBI {

    void withDraw() {
        System.out.println("Enter the amount to be withdrawn:");
        int amount = sc.nextInt();
        System.out.println("Enter city is: " + city);
        System.out.println("The account balance");
        if ((super.balance - amount < 1000) || (amount >= 10000)) {
            System.out.println("Sorry, cannot be withdrawn due to account balance limit");
        } else {
            super.balance = super.balance - amount;
        }
    }

    void deposit() {
        System.out.println("Enter amount to be deposited:");
        deposit = sc.nextInt();
        super.balance = deposit + super.balance;
    }

    public void calculateInterest() {
        System.out.println("Enter the interest rate:");
        int interest = sc.nextInt();
        if (interest >= MINS_INTEREST) {
            double lmn = (super.balance / 100) * interest;
            System.out.println("The amount of interest on the current balance is: " + lmn);
            System.out.println("The total amount is: " + (super.balance + lmn));
        } else {
            System.out.println("Set a valid interest rate as per RBI guidelines");
        }
    }
}

class CurrentAccount extends BankAccount implements RBI {
    void withDraw() {
        System.out.println("Enter the amount to be withdrawn:");
        int amount = sc.nextInt();
        if ((super.balance - amount < 1000) || (amount >= 10000)) {
            System.out.println("Sorry, cannot be withdrawn due to account balance limit");
        } else {
            super.balance = super.balance - amount;
        }
    }

    void deposit() {
        System.out.println("Enter amount to be deposited:");
        deposit = sc.nextInt();
        super.balance = deposit + super.balance;
    }

    public void calculateInterest() {
        System.out.println("Enter the interest rate:");
        int interest = sc.nextInt();
        if (interest >= MINC_INTEREST) {
            double lmn = (super.balance / 100) * interest;
            System.out.println("The amount of interest on the current balance is: " + lmn);
            System.out.println("The total amount is: " + (super.balance + lmn));
        } else {
            System.out.println("Set a valid interest rate as per RBI guidelines");
        }
    }
}

public class interfacerbi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        int savingsChoice = 0;
        int currentChoice = 0;
        int accountTypeChoice = 0;

        while (accountTypeChoice != 3) {
            System.out.println("Enter 1 for Savings, Enter 2 for Current, Enter 3 for exit");
            accountTypeChoice = sc.nextInt();

            switch (accountTypeChoice) {
                case 1:
                    while (savingsChoice != 6) {
                        System.out.println("Enter 1. for input data"); 
                        System.out.println("Enter 2. for deposit");
                        System.out.println("Enter 3. for withdraw");
                        System.out.println("Enter 4. for display");
                        System.out.println("Enter 5. for calculating intrest");
                        System.out.println("Enter 6. for Exit");
                        savingsChoice = sc.nextInt();
                        switch (savingsChoice) {
                            case 1:
                                savingsAccount.inputdata();
                                break;
                            case 2:
                                savingsAccount.deposit();
                                break;
                            case 3:
                                savingsAccount.withDraw();
                                break;
                            case 4:
                                savingsAccount.display();
                                break;
                            case 5:
                                savingsAccount.calculateInterest();
                                break;
                            case 6:
                                System.out.println("Thank you!!");
                                break;
                            default:
                                System.out.println("Enter a valid choice");
                        }
                    }
                    break;

                case 2:
                    while (currentChoice != 6) {
                        System.out.println("Enter 1. for input data");
                        System.out.println("Enter 2. for deposit");
                        System.out.println("Enter 3. for withdraw");
                        System.out.println("Enter 4. for display");
                        System.out.println("Enter 5. for calculating rate of intrest");
                        System.out.println("Enter 6. for Exit");
                        currentChoice = sc.nextInt();
                        switch (currentChoice) {
                            case 1:
                                currentAccount.inputdata();
                                break;
                            case 2:
                                currentAccount.deposit();
                                break;
                            case 3:
                                currentAccount.withDraw();
                                break;
                            case 4:
                                currentAccount.display();
                                break;
                            case 5:
                                currentAccount.calculateInterest();
                                break;
                            case 6:
                                System.out.println("Thank you!!");
                                break;
                            default:
                                System.out.println("Enter a valid choice");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }
        }

       
    }
}
