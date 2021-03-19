public class BankAccount
{
  double balance;

  public BankAccount(double b){
    balance = b;
  }

  public BankAccount(){
    balance = 100.00;
  }

  public void withdraw(double quantity){
    balance = balance - quantity;
  }

  public void deposit(double quantity){
    balance = balance + quantity;
  }

  public String toString(){
    String result;
    result = "The balance is " + balance;
    return result;
  }

  public void setBalance(double input){
    balance = input;
  }

  public double getBalance(){
    return balance;
  }
}
