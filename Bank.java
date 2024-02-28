import java.util.Scanner;

class Bank {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            while(true){
                BankAccount b=new BankAccount();
                SavingAccount s=new SavingAccount();
                System.out.println("1.Input Data: ");
                System.out.println("2.Display Data: ");
                System.out.println("3.Deposit Money: ");
                System.out.println("4.Withdraw Money: ");
                System.out.println("5.Withdraw From Savings Account: ");
                System.out.println("6.Exit ");
                System.out.println("Enter any choice: ");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:b.inputData();
                        
                        break;
                    case 2:b.display();
                        break;
                    case 3:b.deposit();
                        break;
                    case 4:b.withdraw();
                        break;
                    case 5:s.withdraw();
                        break;
                    case 6: System.exit(0);
                    default:
                        System.out.println("Enter valid choice!");
                        break;
                }

                
            }
        }
}

class BankAccount{
    String name;
    int accno,balance,mobile;
    Scanner s=new Scanner(System.in);
    public void inputData(){
        balance=1000;
        
        System.out.println("Enter acc no: ");
        accno=s.nextInt();
        s.nextLine();
        System.out.println("Enter name: ");
        name=s.next();
        System.out.println("Enter mobile: ");
        mobile=s.nextInt();
        System.out.println("Balance: "+balance);
    }

    public void display(){
        System.out.println("Accnp."+"\t"+"Name"+"\t"+"Mobile No."+"\t"+"Balance");
        System.out.println("----------------------------------------------------");
        System.out.println(accno+"\t"+name+"\t"+mobile+"\t"+balance);
    }

    public void withdraw(){
        System.out.println("Enter the amount to withdraw: ");
        int amount=s.nextInt();
        balance=balance-amount;
        System.out.println("Remaining balance: "+balance);
    }

    public void deposit(){
        System.out.println("Enter the amount to deposit: ");
        int amount=s.nextInt();
        balance=balance+amount;
        System.out.println("Remaining balance: "+balance);
    }
}

class SavingAccount{
    Scanner s=new Scanner(System.in);
    int balance=6000;
    public void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        int amount=s.nextInt();
        if(balance-amount<=1000){
            System.out.println("Minimum balance must be 1000!");
        }else{
            balance=balance-amount;
            System.out.println("Remaining balance: "+balance);
        }
    }
}