public class BankAccount {
    String accountName;
    double balance = 1000;

    public BankAccount(String name){
        this.accountName = name;
    }

    public void display() {
        System.out.println("Account Name:  " + accountName);
        System.out.println("Balance:  " + balance);
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposite: " + amount);
        System.out.println("Balance:  " + balance);
    }


    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Balance:  " + balance);
        }
        else{
            System.out.print("Balance not Enough!!! ");
        }
    }
}