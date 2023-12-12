/*Part 2: Movie Discounts
A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.
Extra features*/
package Controlflow;

public class Movie_ticket {

	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter your age: ");

	        int age = scanner.nextInt();

	        double ticketPrice = calculateTicketPrice(age);

	        System.out.printf("The ticket price for a %d-year-old is %.2f Euros\n", age, ticketPrice);

	   
	        scanner.close();
	    }

	    private static double calculateTicketPrice(int age) {
	        if (age < 5) {
	           
	            return 0.4 * 7;
	        } else if (age > 60) {
	            
	            return 0.45 * 7; 
	        } else {
	           
	            return 7;
	        }
	    }
	}

