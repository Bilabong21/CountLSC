import java.util.*;

 public class Bongani
    {
	  public static void main(String[] args)
	    {
		  
		  Scanner input =new Scanner(System.in);
		  
		  System.out.print("Enter the string ");
		  String sName = input.nextLine();
		  char bafo[] =sName.toCharArray();
		  int number = 0, letter = 0, symbol = 0;
		  
		  
		  for(int i = 0; i < bafo.length; i++)
		     {
				 if(Character.isLetter(bafo[i]))
				   {
					   letter++;
				   
				   }else if(Character.isDigit(bafo[i]))
				           {
							   
							   number++;
						   
						   }else 
						       {
								   symbol++;
							   }
						   
			 }
			 
		 System.out.println("The total number of letters is "+ letter + ".\nThe total number of digit is "+ number +".\nThe total number of symbols is "+  symbol );
		}
	} 