/*Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A */


package Controlflow;

import java.util.Scanner;

public class Commission {
	    public static void main(String[] args) {
	        System.out.print("Enter the sales amount: ");
	        Scanner sce = new Scanner(System.in);
	        int sales = sce.nextInt();
	        int commission;
	        
	        
	        if (sales > 10000) {
	            commission = 30;
	        } else if (sales <= 10000 && sales>=5001) {
	            commission = 20;
	        } else if (sales >= 10001) {
	            commission = 10;
	        } else {
	            commission = 0;
	         
	        }
	        if(commission>0) {
	        	System.out.println("commission for sales"+ sales + "is:"+commission+"%");
	        }
	        else {
	        	System.out.println("no commission for"+sales);
	        }
	        sce.close();
	        
	     
	    }
	}


