
// A Class that represents use-defined expception 
class myException extends Exception 
{ 
    public myException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
}

public class ATM extends Exception{
	
	private String name;
	private int accountno;
	private int pin;
	private float Balance;
	private int numberOfTransactions=0;

	
	//para-constructor
	public ATM(String name,int accountnum,float bal,int pin) 
	{
		this.name=new String(name);
		accountno=accountnum;
		Balance=bal;
		this.pin=pin;
	}
	
	
	public ATM()
	{
		//default constructor
	}

	//Accountno
	public int getAccountno() {
		return accountno;
	}

	private void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
   //Pin
	public int getPin() {
		return pin;
	}

	private void setPin(int pin) {
		this.pin = pin;
	}

	//Balance
	public float getBalance() {
		return Balance;
	}

	private void setBalance(float balance) {
		Balance = balance;
	}
	
	//Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = new String(name);
	}

	//NumberOfTransactions
	private int getNumberOfTransactions() {
		return numberOfTransactions;
	}

	private void setNumberOfTransactions(int numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}
	
	//withdraw
	public void withdraw(float withDrawAmt)
	{
	  try
	  {
		  if(getNumberOfTransactions()<=3)
			{
			      if(withDrawAmt<getBalance())
			     {
				      float bal=getBalance();        //Fetching the balance and making changes and saving the new balance
		        	  bal=bal-withDrawAmt;
		        	  
		        	  try 
		        	  {
			        	  if(bal>=100)      //Setting limit for minimum balance
			        	  {
			        		  setBalance(bal);
			        	  }
			        	  else
			        	  {
			        		  //throw an exception for not having sufficient balance
			        		  throw new myException("Minimum Balance Error");
			        	  }
		        	  }		
		        	  catch(myException e)
		        	  {
		        		  System.out.print(e.getMessage());
		        	  }
			     }
			      else
			     {
				       System.out.println("You don't have eough balance to make this transaction !!\n"+
			                       "Your current balance is : getBalance()");
			     }
		    }
			else
			{
				//throwing the exception
				throw new myException("You have reached the maximum transaction limit");
			}
	  }
	  catch(myException e)
	  {
		  System.out.print(e.getMessage());
	  }
		
	}
	
	//deposit
	public void deposit(float depoAmt)
	{
		try 
		{
			if(getNumberOfTransactions()<=3)
			{
				      float bal=getBalance();        //Fetching the balance and making changes and saving the new balance
		        	  bal=bal+depoAmt;
		       
		        	  setBalance(bal);         
		    }
			else
			{
				//throwing the exception
				throw new myException("You have reached the maximum transaction limit");
			}
		}
		catch(myException e)
		{
			System.out.println(e.getMessage());
		}
	    
	}
	
	//Validating the PIN
	public void PinValidaton(int Pin)
	{
    try
      {
		if(this.pin==getPin())
		{
			System.out.println("\nWelcome ");
		}
		else
		{
			//Exception Wrong pin entered
			throw new myException("Wrong pin entered.");
		} 
      }
    catch(myException e)
      {
          System.out.print(e.getMessage());
      }
	}
	
}


