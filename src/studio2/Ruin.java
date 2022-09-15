package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Variables");
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		double totalSimulations = in.nextDouble();
		double Loss = in.nextDouble();
		double Win = in.nextDouble();
		
		while (totalSimulations!=500)
		{
		double currentAmount = startAmount;
		
		while (currentAmount<winLimit && 0<currentAmount)
		{
		 double Hand = Math.random();
		 boolean Lose = (Hand>winChance);
			if (!Lose)
			{	
			currentAmount++;
			}
			else 
			{
			currentAmount--;
			}}
		if (currentAmount>=winLimit)
		{
			System.out.println("Today was Successful: Day "+totalSimulations);
			Win++;
		}
		else 
		{
			System.out.println("Today was Ruinous: Day "+totalSimulations);
			Loss++;
		}
		totalSimulations++;
		}
		System.out.println("Number of Wins: " + Win);
		System.out.println("Total Simulations" + totalSimulations);
		double ruinRate = (Loss/(Loss+Win));
		System.out.println("Ruin Rate from Simulation = "+ruinRate);
		if (winChance==.5)
		{
			double expectedRuin = (1-(startAmount/winLimit));
			System.out.println("Expected Ruin Rate: "+expectedRuin);
		}
		else 
		{
			double Alpha = ((1-winChance)/winChance);
			double expectedRuin = ((Math.pow(Alpha,startAmount)-Math.pow(Alpha, winLimit))/(1-Math.pow(Alpha, winLimit)));
			System.out.println("Expected Ruin Rate: "+expectedRuin);
		}
	}

}
