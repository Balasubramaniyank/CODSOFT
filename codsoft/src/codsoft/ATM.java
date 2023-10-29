package codsoft;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		
		
		int balance=1000,withdraw,deposit;
		Scanner sc =new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("welcome to SBI ATM");
			System.out.println("ENTER 1 WITHDRAW");
			System.out.println("ENTER  2 DEPOSIT");
			System.out.println("ENTER 3 BALANCE ");
			System.out.println("ENTER 4 EXIT");
			
			System.out.println("");
			
			System.out.println("ENTER THE NUMBER");
			
		     int entry=sc.nextInt();
		     
		     switch(entry) {
		     case 1:
		           System.out.println("enter the withdraw amount");
		           withdraw=sc.nextInt();
		       
		           if(balance>=withdraw) {
		           
		           balance=balance-withdraw; 
		           
		           System.out.println("collect your money");
		           System.out.println("withdraw succesfully");
		           }
		           else {
		        	   
		        	   System.out.println("insufficent fund");
		           }
		           System.out.println("");
		           
		           break;
		           
		           
		     case 2:
		    	 
		    	  System.out.println("enter the deposit amount");
		    	  deposit=sc.nextInt();
		    	 
		    	  balance=balance+deposit;
		    	  System.out.println("deposit succesfully");
		    	 
		    	  System.out.println("");
		    	  break;
		    	 
		    	 
		     case 3:
		    	 
		    	 System.out.println("amount="+balance);
		    	 
		    	 System.out.println("");
		    	 
		    	 break;
		    	 
		     case 4:
		    	 
		    	 System.exit(0);
		    	 
		    	 
		     
		     
		     }
			
		}
		

	}
	
	
}

	
	

