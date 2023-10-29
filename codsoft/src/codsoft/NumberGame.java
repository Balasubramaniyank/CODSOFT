package codsoft;

import java.util.Random;

import java.util.Scanner;

public class NumberGame {
	
	

	public static void main(String[] args)
	{
	
		Scanner sc =new Scanner(System.in);
		Random random = new Random();
		
		int minvalue=1;
		int maxvalue=100;
		
		int randomnumber=random.nextInt( maxvalue - minvalue + 1) + minvalue;
		int attempts = 0;
		
		System.out.println("WELCOME YOUR GUESS:");
		System.out.println("Selected a Randow number between" +minvalue+ "and" +maxvalue+ "Try to guess it!");
		
		while(true)
		{
			System.out.println("Enter your guess:");
			int userguess= sc.nextInt(); 
			attempts++;
			
			if(userguess<minvalue|| userguess > maxvalue)
			{
				System.out.println("please enter a number within the valid value.");
			}
			else if(userguess < randomnumber)
			{
				System.out.println("Too low! Try again.");
			}
			else if (userguess > randomnumber)
			{
				System.out.println("Too high! Try again.");
			}
			else {
				
				System.out.println("Congratulation! you guessed the number("+randomnumber+")in"+attempts+"attempts.");
				break;
			}
		}
		
		sc.close();
	}



}
