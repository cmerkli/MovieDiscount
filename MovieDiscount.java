 /* Programmer: Cyntia Merkli
 * Date: September 25 2020
 * Purpose: Create movie ticket that gives discounts
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();
        
        // Make cost variable
        double cost = 14.50;

        // Print the cost of a movie ticket
        if (age < 13 || age > 64){
        	double cost2 = cost - 3;
        	if (coupon == true) {
        		double cost3 = cost2 -2; 
        		System.out.println("Your ticket costs $"+ cost3 +".");
        	}
        	else {
        		System.out.println("Your ticket costs $"+ cost2 +".");
        	}
        }
        else {
        	if (coupon == true){
        		double cost4 = cost - 2;
        		System.out.println("Your ticket costs $"+ cost4 +".");
        	}
        	else {
        		System.out.println("Your ticket costs $"+ cost +".");
        	}
        }
        
    }
}
