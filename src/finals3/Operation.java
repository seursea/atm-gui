package finals3;

//'Operation' interface defines a set of operations that can be performed the ATM
public interface Operation {
    
    // Abstract method to deposit a specified amount into the account
    public abstract void deposit(double amt);
     
    // Abstract method to withdraw a specified amount from the account
    public abstract void withdraw(double amt);
    
    // Abstract method to retrieve the current balance of the account
    public abstract double getBalance();
}
