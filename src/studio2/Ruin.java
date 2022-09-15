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
		while (startAmount<winLimit && 0<startAmount)
		{
		 double Hand = Math.random();
		 boolean Lose = (Hand>winChance);
			if (!Lose)
			{	
			startAmount++;
			}
			else 
			{
			startAmount--;
			}}
		if (startAmount>=winLimit)
		{
			System.out.println("Today was Successful");
		}
		else 
		{
			System.out.println("Today was Ruinous");
		}
		
	}

}
