import java.util.Scanner;
import java.util.Random; 

public class Lottery 
{
	//array of lottery
	static int[]lot=new int[5];   

	public Lottery() 
	{          //constructor to generate random lottery no.
		for(int i=0;i<5;i++) 
		{
			Random rand = new Random();
			lot[i]=rand.nextInt(10);
		}
	}
	
	public int match(int[] l) 
	{        // function to return no. of matching digits
	      int count=0;
	      for(int i=0;i<5;i++) 
	      {
	    	  if(lot[i]==l[i])
	    		   count++;
	      }
	      return count;
	}
	public void getlot() 
	{                      //function to display winner lottery no.
		 for(int i=0;i<5;i++) 
		 {
	    	 System.out.print(lot[i]);
	     }
	}
	
	public static void main(String[] args) 
	{    // main function
		  Lottery k=new Lottery();
		  int[]a=new int[5];
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("Enter the Lottery no(including spaces):-");
		  for(int i=0;i<5;i++) 
		  {
			  	a[i]=in.nextInt();
		  }
		  
		  int check=k.match(a);
		  System.out.println("The No. of digits matched is:-"+check);
		  
		  if(check==5)
			  System.out.println("\nCongrats!! You are the lucky winner");
		  else 
		  {
			     System.out.println("The Winner is:-");
			     k.getlot();
		  }
	}    
}
