import java.util.ArrayList;
import java.util.Scanner;

public class ATMmain {

	public ATMmain() {
		// TODO Auto-generated constructor stub
	}
	
	//addUser()
	public static void addUser(ATM user)
	{
		Scanner input = new Scanner(System.in);
		String name;
        float bal;
        int accountnum,pin;
        
        System.out.println("\n ----------- Add User -----------\n");
        System.out.println("Enter Name : ");
        name=input.next();
        System.out.println("Enter Account Number : ");
        accountnum=input.nextInt();
        System.out.println("Enter Balance : ");
        bal=input.nextFloat();
        System.out.println("Enter PIN : ");
        pin=input.nextInt();
        
        user =new ATM(name,accountnum,bal,pin);
	}
	
	//withdrawAmt()
	public static void withdrawAmt(ATM user)
	{
		float withDrawAmt=0;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the amount you want to withdraw : ");
		withDrawAmt=input.nextInt();
		user.withdraw(withDrawAmt);
	}
	
	//depositAmt()
	public static void depositAmt(ATM user)
	{
		float submitAmt=0;
		Scanner enter=new Scanner(System.in);
		
		System.out.print("Enter the amount you want to deposit : ");
		submitAmt=enter.nextInt();
		user.deposit(submitAmt);
	}
	
	//checkBal()
	public static void checkBal(ATM user)
	{
		System.out.println("Your current account balance is  : "+user.getBalance());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    ATM user = new ATM();
        String name;
        float amount;
        boolean status = true;
        int choice,accno,pin;
        
        //adding a user
        addUser(user);
        
        //processing
        System.out.print("\n----------------- WELCOME TO ATM - JAVA LAB -----------------\n");
        System.out.print("Enter Account Number : ");
        accno=input.nextInt();
        System.out.print("Enter PIN Number : ");
        pin=input.nextInt();
        
        user.PinValidaton(pin);
        
        while(status==true)
        {
        	try 
        	{
        		System.out.println("1. Deposit Amount\n2. Withdraw Amount\n3. Check Balance\n4. Exit\n");
            	choice=input.nextInt();
            	
            	switch(choice)
            	{
                 		     
            	case 1 : depositAmt(user);
       		             break;
            	case 2 : withdrawAmt(user);
       		             break;
            	case 3 : checkBal(user);
       		             break;
            	case 4 : status=false;
                         break;
            	default : throw new myException("Wrong choice entered !!!");//Throw wrong value choice exception 
       		             
            	}  	
            	
            }
        	catch (myException e)
        	{
        		e.getMessage();
        	}
	}

}
}
