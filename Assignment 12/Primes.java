import java.io.*;
import java.util.*;

/**
 * Primes is a program that will compute prime numbers using the sieve of Eratosthenes.
 * 
 * @author Charles Hoot
  * @version 4.0
 */

    
public class Primes
{

    public static void main(String args[])
    {

        int max;
        
        System.out.println("Maximum value to test for primality");
        max = getInt(" It should be an integer value greater than or equal to 2.");
        
        ListInterface<Integer> composite=new AList(max);
        ListInterface<Integer> candidate=new AList(max);
        ListInterface<Integer> prime=new AList(max);
        
        //Adding the numbers into the list
        for(int i=2;i<=max;i++) 
        	candidate.add(i);
        
        //till the candidate list does not divided into prime and composite
        while(!candidate.isEmpty()) 
       {
        	int removed=candidate.remove(1);
        	prime.add(removed);
        	getComposites(candidate,composite,removed);
        }
        
        System.out.println("Candidates:-"+candidate);
        System.out.println("Composites:-"+composite);
        System.out.println("Primes:-"+prime);
    }
    
    
    /**
     * getComposites - Remove the composite values from possibles list and
     * put them in the composites list.
     *
     * @param  candidates   A list of integers holding the possible values.
     * @param  composites   A list of integers holding the composite values.
     * @param  prime   An Integer that is prime.
     */
    public static void getComposites(ListInterface<Integer> candidates, ListInterface<Integer> composites, Integer prime)
    {
        for(int i=1;i<=candidates.getLength();i++) {
        	if(candidates.getEntry(i)%prime==0)
        	{
        		composites.add(candidates.remove(i));
        		i--;
        	}
        }
    }
    
    
    
    
    /**
     * Get an integer value.
     *
     * @return     An integer. 
     */
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //Default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }        
        catch(Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;
                                    
    }    
    
}
