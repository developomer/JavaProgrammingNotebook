package day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){System.out.println("Your available balance is: $"+ balance);}

    public void deposit(double amount){
         if (amount > 0){
             System.err.println("Insufficient amount: $"+ amount);
             return;
         }
        System.out.println("Depositing $"+ amount+ " to "+accountHolder);
        balance += amount;
    }

    public void withdraw(double amount){

        if (amount > balance){
            System.err.println("Insufficient amount: $"+ amount);
            return;
        }
        System.out.println("Withdrawing $"+ amount+ " to "+accountHolder);
        balance -= amount;
    }
}
