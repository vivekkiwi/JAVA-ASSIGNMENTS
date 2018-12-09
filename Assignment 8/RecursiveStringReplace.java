
/**
 * A class that has a methond to recursively replaces characters in a String.
 * 
 * @author Charles Hoot
 * @version 4.0
 */
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to)
    {          
    	        if(s.length()<1)
    	        	return null;
    	        else if (s.length()==1) 
    	        {
    	        	char first = (from == s.charAt(0)) ? to : s.charAt(0);
    	        	String str="";
      		        return first + str;
    		    }
    		    else 
    		    {
    		      char first = (from == s.charAt(0)) ? to : s.charAt(0);
    		      return first + replace(s.substring(1), from, to);
    		    }
    }


}
