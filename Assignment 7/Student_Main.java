import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main extends RuntimeException{


	public static void main(String[] args) 
	{
		
	   Scanner input = new Scanner(System.in);
       ArrayList <Student_Report> Student = new ArrayList <Student_Report>();    //ArrayList to store info
       int e1,e2,e3,e4,n,i;
       String str;
       
       
       //Inputting the number of students 
       System.out.print("Enter the number of students you want to enter : ");
       n=input.nextInt();
       
       try
       {
    	   //input
    	   for(i=0;i<n;i++)
           {
        	   System.out.println("Enter the name and marks in all four subjects : ");
        	   str=input.next();
        	   e1=input.nextInt();
        	   e2=input.nextInt();
        	   e3=input.nextInt();
        	   e4=input.nextInt();
        	   
        	   if((e1<0||e1>100)||(e2<0||e2>100)||(e3<0||e3>100)||(e4<0||e4>100))
        	   {
        		   
        		   //Throwing the exception upon violating the boundary conditions and setting the number 
        		   //of elements till the safe conditons 
        		   n=i;
        		   throw new IllegalAccessException("Incorrect value entered"); 
        	   }
        	   else
        	   Student.add(new Student_Report(str,e1,e2,e3,e4));
           }
       }
       //Exception caught
       catch(Exception e)     
       {
    	   System.out.println("Exception caught "+e);
       }
       
       // Used so that the execution stops till here only
     /*  finally                      
       {  System.exit(0);  }  
    */ 
       //Displaying the details of the student
       for(i=0;i<n;i++)
       {
    	   Student_Report entry=Student.get(i);
    	   System.out.print("\n-------------------------------------------\n");
    	   entry.display();
       }
	}

}
