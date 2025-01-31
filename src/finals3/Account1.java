package finals3;

// The class Account1 implements the Operation interface
public class Account1 implements Operation
{
    // Private member variables to store account information
    private int accNum = 123;
    private String name = "Eunice Opeña";
    private String address = "Tagaytay";
    private String email = "euniceopena@gmail.com";
    private String contactNum = "09123456789";
    private String birthDate = "8/29/2003";
    private double existBal = 10000;
    double balance = getExistBal();

    // Default constructor
    Account1() {}
    
    // Parameterized constructor to initialize account with specific values
    Account1(int accNum, String name, String address, String email, String contactNum,
            String birthDate, double existBal){
        this.accNum = accNum;
        this.name = name;
        this.address = address;
        this.email = email; 
        this.contactNum = contactNum;
        this.birthDate = birthDate;
        this.existBal = existBal;
    }
    
    // Getter methods for retrieving account information
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
