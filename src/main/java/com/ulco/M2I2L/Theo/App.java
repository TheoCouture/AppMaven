package com.ulco.M2I2L.Theo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Boolean success = true;
        String calculus = scanner.nextLine();
        
        String splitted[] = calculus.split(" ");
        
        
        try {
        
		    Float number1 = Float.parseFloat(splitted[0]);
		    Float number2 = Float.parseFloat(splitted[2]);
		    Float result = null;
		    
		    switch(splitted[1]) {
		    case "+":
		    	result = number1 + number2;
		    break;
		    case "-":
		    	result = number1 - number2;
		    break;
		    case "/":
		    	result = number1 / number2;
		    	break;
		    case "*":
		    	result = number1 * number2;
		    break;
	    	default:
	    		System.out.println("Error");
	    		break;
		    }
		    
		    if (success) {
		    	System.out.println("Le résultat est : " + result);
		    }
		    
		    
        }catch (Exception e){
        	System.out.println("Error : Please check your inputs");
        }
    }
}
