import java.util.*;

class BankAccount{

    private String AccountHolder;
    private String AccountNumber;
    private double balance;


    //constructor
    BankAccount(String AccountHolder, String AccountNumber, double IntialBalance){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;

        //check the balance validity
        if(IntialBalance>=0){
            this.balance = IntialBalance;
        }else{
            this.balance =0;
            System.out.println("Balance cannot be negative . Setting to 0......");
        }
    }


    //deposit
    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }else{
            System.out.println("Amount must be positive.");
        }
    }

    //withdraw
    public void withdraw(double amount){
        if(amount>0){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdrawn: "+amount);
            }else{
                System.out.println("Insuffienct balance");
            }
        }else{
            System.out.println("Amount must be positive.");
        }
    }

    //check balance
    public void balance(){
        System.out.println("Balance : "+balance);
    }

    //show account details
    public void showdetails(){
        System.out.println("Account Holder Name: "+AccountHolder);
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Balance: "+balance);
    }

    //get account number
    public String getAccNo(){
        return AccountNumber;
    }
}

public class BankApp {

    // array list
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    //helper method-> to find if the account number is there in the list or not
    public static BankAccount findAcc(String AccountNumber){
        for (BankAccount acc:accounts){
            if(acc.getAccNo().equals(AccountNumber)){
            return acc;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        System.out.println("---Welcome to my Banking Application---");
        do{
            System.out.println("1. Create a new account");
            System.out.println("2. Access existing account");
            System.out.println("3. Exit");

            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Account Holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Account Number:  ");
                    String accno = sc.nextLine();
                    System.out.print("Balance: ");
                    double intialbalance = sc.nextDouble();
                    //create object
                    BankAccount newacc = new BankAccount(name,accno,intialbalance);
                    accounts.add(newacc);
                    break;
                case 2:
                    System.out.print("Enter the account number : ");
                    String accnumber = sc.nextLine();

                    //check in the list
                    //first create the bankaccount obj then take help of helper method
                    BankAccount acc = findAcc(accnumber);

                    if(acc!=null){
                        int subchoice;
                        do{
                            System.out.println("--Bank Menu--");
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Account Details");
                            System.out.println("5. Back to Main Menu");

                            System.out.print("Enter your choice: ");
                            subchoice = sc.nextInt();

                            switch(subchoice){
                                case 1:
                                    System.out.print("Enter the amount to deposit: ");
                                    double depositeamount = sc.nextDouble();
                                    acc.deposite(depositeamount);
                                    break;
                                case 2:
                                    System.out.print("Enter the amount to withdraw: ");
                                    double withdrawamount = sc.nextDouble();
                                    acc.withdraw(withdrawamount);
                                    break;
                                case 3:
                                    acc.balance();
                                    break;
                                case 4:
                                    acc.showdetails();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }while(subchoice!=5);
                    }else{
                        System.out.println("Account doesnot exit!");
                        System.out.println("Create a new account");
                    }
                    break;
                case 3:
                    System.out.println("Thanks for banking with us.");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=3);
    }
}