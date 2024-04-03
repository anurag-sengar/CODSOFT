import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        System.out.println("Enter Your PIN to proceed.");
        int pin = sc.nextInt();
        if (pin == 1234)
        {
            atm.run();
        }
        else
        {
            System.out.println("Invalid pin. Entry denied.");
        }
        sc.close();
    }
}
class BankAccount
{
    private int balance;
    public BankAccount(int initialAmount)
    {
        this.balance = initialAmount;
    }
    public int balance()
    {
        return balance;
    }
    public void deposit(int amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit of Rs. " + amount + " completed successfully.");
        }
        else
        {
            System.out.println("Kindly enter a significant amount. [The entered amount is negligible.]");
        }
    }
    public void withdraw(int amount)
    {
        if (amount > 0 && amount <= balance)
        {
            System.out.println("Withdraw of Rs. "+amount+" completed successfully.");
            balance -= amount;
        }
        else
        {
            System.out.println("Kindly enter a significant amount. [The entered amount is either greater than the account balance or negligible.]");
        }
    }
}
class ATM
{
    private BankAccount account; 
    public ATM(BankAccount account)
    {
        this.account = account;
    }
    public void display()
    {
        System.out.println("Enter your choice :");
        System.out.println("1. Deposit your money.");
        System.out.println("2. Withdraw your money.");
        System.out.println("3. Check your balance.");
        System.out.println("4. Exit.");
    }
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            display();
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the amount of money to be deposited.");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount of money to be withdrawn.");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is Rs. " + account.balance());
                    break;
                case 4:
                    System.out.println("Thanks, have a nice day !!");
                    break;
                default:
                    System.out.println("Invalid choice. Kindly enter a significant choice.");   
            }
        }
        while (choice != 4);
        sc.close();;
    }
}
