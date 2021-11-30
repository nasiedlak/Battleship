import java.util.*;
public class BattleshipMain 
{
	public static void main(String[]args)
	{
		BattleshipClass player = new BattleshipClass();
		Scanner x = new Scanner(System.in);
		
		System.out.println("******************************Welcome to Battleship******************************\n");
		System.out.println("Place your ships in the best location to see how long you can last!\n");
		
		System.out.println("These are your ships:\n\n" +
				"1 x Aircraft Carrier (5 spaces)\n" + 
				"1 x Battleship (4 spaces)\n" + 
				"1 x Cruiser (3 spaces)\n" + 
				"1 x Destroyer (2 spaces)\n" + 
				"1 x Submarine (2 spaces)\n");
		
		System.out.println("Starting with the aircraft carrier and following down the list above, "
				+ "you will \nenter two cooridinates. One for the front and back end of the ship.\n");
		
		System.out.println("Here's your board: \n");
		player.printArray();
		
		System.out.println("\nEnter all coordinates with a space between (e.g. A1 A5).");
		
		boolean next1 = false;
		boolean vertical1 = false;
		String aircraft = "";
		do 
		{
			System.out.println("\nAircraft Carrier coordinates:");
			aircraft = x.nextLine();
			if(aircraft.length() == 5)
				if(aircraft.substring(3,4).equals(aircraft.substring(0,1)) || aircraft.substring(4,5).equals(aircraft.substring(1,2)))
					if(Math.abs(((Integer.parseInt(aircraft.substring(4,5)) - Integer.parseInt(aircraft.substring(1,2))))) == 4 || Math.abs(((Integer.parseInt(aircraft.substring(4,5)) - Integer.parseInt(aircraft.substring(1,2))))) == 0)
						next1 = true;
					else
						System.out.print("Invalid input. Try again:\n");
				else
					System.out.print("Invalid input. Try again:\n");
			else
				System.out.print("Invalid input. Try again:\n");
			if(aircraft.substring(3,4).equals(aircraft.substring(0,1))) 
				vertical1 = true;
			else
				vertical1 = false;
		}while(!next1);
		
		if(vertical1) 
		{
			System.out.println();
			player.replaceArrayVertical(aircraft.substring(0,1), aircraft.substring(4,5), (aircraft.substring(1,2)));
		}	
		else 
		{
			System.out.println();
			player.replaceArrayHorizontal(aircraft.substring(0,1), aircraft.substring(3,4), (aircraft.substring(1,2)));
		}
		
		boolean next2 = false;
		boolean vertical2 = false;
		String battleship = "";
		do 
		{
			System.out.println("\nBattleship coordinates:");
			battleship = x.nextLine();
			if(battleship.length() == 5)
				if(battleship.substring(3,4).equals(battleship.substring(0,1)) || battleship.substring(4,5).equals(battleship.substring(1,2)))
					if(Math.abs(((Integer.parseInt(battleship.substring(4,5)) - Integer.parseInt(battleship.substring(1,2))))) == 3 || Math.abs(((Integer.parseInt(battleship.substring(4,5)) - Integer.parseInt(battleship.substring(1,2))))) == 0)
						next2 = true;
					else
						System.out.print("Invalid input. Try again:\n");
				else
					System.out.print("Invalid input. Try again:\n");
			else
				System.out.print("Invalid input. Try again:\n");
			if(battleship.substring(3,4).equals(battleship.substring(0,1))) 
				vertical2 = true;
			else
				vertical2 = false;
		}while(!next2);
		
		if(vertical2) 
		{
			System.out.println();
			player.replaceArrayVertical(battleship.substring(0,1), battleship.substring(4,5), (battleship.substring(1,2)));
		}	
		else 
		{
			System.out.println();
			player.replaceArrayHorizontal(battleship.substring(0,1), battleship.substring(3,4), (battleship.substring(1,2)));
		}
		
		boolean next3 = false;
		boolean vertical3 = false;
		String cruiser = "";
		do 
		{
			System.out.println("\nCruiser coordinates:");
			cruiser = x.nextLine();
			if(cruiser.length() == 5)
				if(cruiser.substring(3,4).equals(cruiser.substring(0,1)) || cruiser.substring(4,5).equals(cruiser.substring(1,2)))
					if(Math.abs(((Integer.parseInt(cruiser.substring(4,5)) - Integer.parseInt(cruiser.substring(1,2))))) == 2 || Math.abs(((Integer.parseInt(cruiser.substring(4,5)) - Integer.parseInt(cruiser.substring(1,2))))) == 0)
						next3 = true;
					else
						System.out.print("Invalid input. Try again:\n");
				else
					System.out.print("Invalid input. Try again:\n");
			else
				System.out.print("Invalid input. Try again:\n");
			if(cruiser.substring(3,4).equals(cruiser.substring(0,1))) 
				vertical3 = true;
			else
				vertical3 = false;
		}while(!next3);
		
		if(vertical3) 
		{
			System.out.println();
			player.replaceArrayVertical(cruiser.substring(0,1), cruiser.substring(4,5), (cruiser.substring(1,2)));
		}	
		else 
		{
			System.out.println();
			player.replaceArrayHorizontal(cruiser.substring(0,1), cruiser.substring(3,4), (cruiser.substring(1,2)));
		}
		
		boolean next4 = false;
		boolean vertical4 = false;
		String destroyer = "";
		do 
		{
			System.out.println("\nDestroyer coordinates:");
			destroyer = x.nextLine();
			if(destroyer.length() == 5)
				if(destroyer.substring(3,4).equals(destroyer.substring(0,1)) || destroyer.substring(4,5).equals(destroyer.substring(1,2)))
					if(Math.abs(((Integer.parseInt(destroyer.substring(4,5)) - Integer.parseInt(destroyer.substring(1,2))))) == 1 || Math.abs(((Integer.parseInt(destroyer.substring(4,5)) - Integer.parseInt(destroyer.substring(1,2))))) == 0)
						next4 = true;
					else
						System.out.print("Invalid input. Try again:\n");
				else
					System.out.print("Invalid input. Try again:\n");
			else
				System.out.print("Invalid input. Try again:\n");
			if(destroyer.substring(3,4).equals(destroyer.substring(0,1))) 
				vertical4 = true;
			else
				vertical4 = false;
		}while(!next4);
		
		if(vertical4) 
		{
			System.out.println();
			player.replaceArrayVertical(destroyer.substring(0,1), destroyer.substring(4,5), (destroyer.substring(1,2)));
		}	
		else 
		{
			System.out.println();
			player.replaceArrayHorizontal(destroyer.substring(0,1), destroyer.substring(3,4), (destroyer.substring(1,2)));
		}
		
		boolean next5 = false;
		boolean vertical5 = false;
		String sub = "";
		do 
		{
			System.out.println("\nSubmarine coordinates:");
			sub = x.nextLine();
			if(sub.length() == 5)
				if(sub.substring(3,4).equals(sub.substring(0,1)) || sub.substring(4,5).equals(sub.substring(1,2)))
					if(Math.abs(((Integer.parseInt(sub.substring(4,5)) - Integer.parseInt(sub.substring(1,2))))) == 1 || Math.abs(((Integer.parseInt(sub.substring(4,5)) - Integer.parseInt(sub.substring(1,2))))) == 0)
						next5 = true;
					else
						System.out.print("Invalid input. Try again:\n");
				else
					System.out.print("Invalid input. Try again:\n");
			else
				System.out.print("Invalid input. Try again:\n");
			if(sub.substring(3,4).equals(sub.substring(0,1))) 
				vertical5 = true;
			else
				vertical5 = false;
		}while(!next5);
		
		if(vertical5) 
		{
			System.out.println();
			player.replaceArrayVertical(sub.substring(0,1), sub.substring(4,5), (sub.substring(1,2)));
		}	
		else 
		{
			System.out.println();
			player.replaceArrayHorizontal(sub.substring(0,1), sub.substring(3,4), (sub.substring(1,2)));
		}
		
		System.out.print("\nThe computer will now begin guessing. For every round you don't get \nhit, you will earn one point. An 'X' marks where the computer has shot.\nIf you win 25 rounds, you win! Good luck!\n\n");
		
		int count = 16;
		int roundWins = 0;
		String answer = "";
		do 
		{
			if(player.attackArray()) 
			{
				count--;
				System.out.println("Hit!\n");
				if(count == 0)
					break;
			}			
			else 
			{
				roundWins++;
				System.out.println("Victory!\n");
				if(roundWins == 25)
					break;
			}	
			player.printAttack();
			System.out.println("\nRounds won: " + roundWins + "\n");
			System.out.println("Continue? y or n:");
			answer = x.nextLine();
			System.out.println("*********************************************************************************\n");
		}while(!answer.equals("n"));
		
		if(roundWins == 25)
			System.out.println("\nYou won. Congratulations!\n\nGoodbye!");
		else if(count == 0)
			System.out.println("\nDefeat. Sorry!\n\nGoodbye!");
		else 
			System.out.println("\nGoodbye!");
	}

}
