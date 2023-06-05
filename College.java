// Exammple Chapter 5 5/16/23


import java.util.Scanner;

public class College
{
	public static void main(String[] args) 
	{
	  // variables and constants
	  int year;
	  Scanner kbd = new Scanner(System.in);

	  //Input phase
	  System.out.print("How many years have you been in college >>");
	  year = kbd.nextInt();

	  // Processing and output phases
	  switch(year)
	   {
	  	   case 1: 
	  	   	  System.out.println("You are a Freshman");
	  	   	  break;

	  	   	case 2:
	  	   	  System.out.println("You are a Sophmore");
	  	   	  break;

	  	   	case 3:
	  	   	  System.out.println("You are a Junior"); 
	  	   	  break;

	  	   	case 4:
	  	   	  System.out.println("You are a Senior");
	  	   	  break;   
	  	   	default:
	  	   	  System.out.println("Sorry, invalid year"); 
	    } // end of switch statement
	} // end of main()
}// end of class