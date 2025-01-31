package finals3;

// The class Account2 extends the Account1 class
public class Account2 extends Account1
{
    // Private member variables to store account information for Account2
    private int accNum = 456;
    private String name = "Patrice Pasacsac";
    private String address = "Amadeo";
    private String email = "patpasacsac@gmail.com";
    private String contactNum = "09157681234";
    private String birthDate = "1/17/2005";
    private double existBal = 15000;
    double balance = getExistBal();

    // Default constructor for Account2
    Account2() {}
    // Parameterized constructor for Account2 to 
    // initialize account with specific values
    Account2(int accNum, String name, String address, String email, String contactNum,
            String birthDate, double existBal){
        super(accNum, name, address, email, contactNum, birthDate, existBal); // super() calls parent constructor
    }
    
    // Getter methods to retrieve account information for Account2
    // Overrides methods in Account1
    public int getAccNum() 
    {
        return accNum;
    }

    public String getName() 
    {
        return name;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getContactNum() 
    {
        return contactNum;
    }

    public String getBirthday() 
    {
        return birthDate;
    }

    public double getExistBal() 
    {
        return existBal;
    }
        
    // Method to deposit money into the account
    public void deposit(double amt)
    {
    	balance = balance + amt;
    	System.out.println("Deposited: Php " + amt);
    }
     
    // Method to withdraw money from the account
    public void withdraw(double amt)
    {
        if(balance > amt)
    	{
    		balance = balance - amt;
                System.out.println("Withdrew: Php " + amt);
    	}
        else
        {
    	    System.out.println("Could not Withdraw: Insufficent Amount.");
        }
        
    }
    
    // Getter method to retrieve the current balance
    public double getBalance()
    {
        return balance;
    }
}
