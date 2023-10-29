package codsoft;

import java.util.Scanner;

public class StundentGradeCalculator {
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("STUDENTGRADECALCULATOR");
		
		
		System.out.println("Enter the Number of subject:");
		
		int num=sc.nextInt();
		sc.nextLine();
		
		if(num<=0)
		{
			System.out.println("Invalid number of subject");
			return;
			
		}
		String names []=new String[num];
		double marks[]=new double[num];
		
		for(int i=0; i<num; i++ )
		{
			System.out.println("Enter the Name of Subject"+(i+1)+":");
			names[i]=sc.nextLine();
			
			System.out.println("Enter marks for  "+names[i]+":");
		    marks[i]=sc.nextDouble();
		    
		    if(marks[i]<0|| marks[i]>100)
		    {
		    	
		    	System.out.println("INVALID MARKS.only enter a marks should be between 1 TO 100");
		    	return;
		    }
		    sc.nextLine();
		    
		}
		
		double totalmarks=0;
		for(double mark:marks)
		{
			totalmarks=totalmarks+mark;
		}
			
		double averagepercentage = totalmarks/num;
		
		String grade;
		if(averagepercentage >=90)
		{
		
			grade="A";
			
		}
		else if(averagepercentage >=80)
		{
		
			grade="B";
			
		}
		else if(averagepercentage >=70)
		{
		
			grade="C";
			
		}
		else if(averagepercentage >=60)
		{
		
			grade="D";
			
		}
		else
		{
		
			grade="FAIL";
			
		}
		
		System.out.println("TOTAL MARKS:"+totalmarks);
		System.out.println("Average percentage:"+averagepercentage+"%");
		System.out.println("Grade:"+grade);
		
	}

}



