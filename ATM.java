import java.util.Scanner;

class BankAccount{
    float balance;

    //Constructor to initialize the balance
    public void initialize(float initialBalance){
        this.balance= initialBalance;
    }

    //Method to withdraw amount
    public void withdraw(float amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdraw Sucessfull. Remaining balance: Rs "+balance);

        } else {
            System.out.println("Insufficient balance.  :( ");
        }
    }

    //Method to deposit amount
    public void deposit(float amount){
        balance += amount;
        System.out.println("Deposit Sucessfull. Balance: Rs "+balance);
    }

    //Method to check amount
    public void CheckBalance(){
        System.out.println("Current Balance: Rs "+balance);
    }
    
}

public class ATM {

    public static void main(String[] args){
        float initialBalance=500;
        BankAccount account= new BankAccount();
        account.initialize(initialBalance);

        Scanner sc= new Scanner(System.in);
        
        System.out.println("\n|-----Welcome to ATM Machine-----|\n");
        while(true){
        System.out.println("\n 1. Withdraw \n 2. Deposit \n 3. CheckBalance\n 4. Exit \n");
        System.out.println("Choose an option: ");
        int choice= sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the amount you want to withdraw: ");
                float withdrawAmount= sc.nextFloat();
                account.withdraw(withdrawAmount);;
                break;
                
            case 2:
                System.out.println("Enter the amount you want to deposit: ");
                float depositAmount= sc.nextFloat();
                account.deposit(depositAmount);
                break;
            
            case 3:
                account.CheckBalance();
                break;

            case 4:
                System.out.println("Thank you for using ATM Machine.");
                sc.close();
                System.exit(0);

                break;
            
            default:
            System.out.println("Invalid Option. Please choose correctly.");
        }
    }
    
        
    }
    
}
