import java.util.*;
public class BattleshipClass 
{
	private String[][]x;
	private boolean hit;
	private int rowCoordinate;
	private int columnCoordinate;
	private ArrayList coordinatesX;
	private ArrayList coordinatesY;
	
	public BattleshipClass()
	{
		hit = false;
		coordinatesX = new ArrayList();
		coordinatesY = new ArrayList();
	}

	
	public String[][] initializeArray() 
	{
		String[][]x = new String[10][10];
		int count = 1;
		for(int i = 0;i < 10;i++) 
		{
			for(int j = 0;j < 10;j++) 
			{
				if(i == 0 && j == 1)
					x[i][j] = "A";
				else if(i == 0 && j == 2)
					x[i][j] = "B";
				else if(i == 0 && j == 3)
					x[i][j] = "C";
				else if(i == 0 && j == 4)
					x[i][j] = "D";
				else if(i == 0 && j == 5)
					x[i][j] = "E";
				else if(i == 0 && j == 6)
					x[i][j] = "F";
				else if(i == 0 && j == 7)
					x[i][j] = "G";
				else if(i == 0 && j == 8)
					x[i][j] = "H";
				else if(i == 0 && j == 9)
					x[i][j] = "I";
				else if(j == 0 && i > 0)
					x[i][j] = Integer.toString(count++);
				else
					x[i][j] = "0";
			}
		}
		return x;
	}
	
	public void printArray() 
	{
		x = initializeArray();
		for(int i = 0;i < 10;i++) 
		{
			for(int j = 0;j < 10;j++) 
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void replaceArrayVertical(String a, String b, String c) 
	{
		int letterIndex = 1000;
		if(a.equals("A"))
			letterIndex = 1;
		if(a.equals("B"))
			letterIndex = 2;
		if(a.equals("C"))
			letterIndex = 3;
		if(a.equals("D"))
			letterIndex = 4;
		if(a.equals("E"))
			letterIndex = 5;
		if(a.equals("F"))
			letterIndex = 6;
		if(a.equals("G"))
			letterIndex = 7;
		if(a.equals("H"))
			letterIndex = 8;
		if(a.equals("I"))
			letterIndex = 9;
		
		int max = Integer.parseInt(b);
		int min = Integer.parseInt(c);
		if(Integer.parseInt(c) > Integer.parseInt(b)) 
		{
			max = Integer.parseInt(c);
			min = Integer.parseInt(b);
		}	
			
		int count = Math.abs(Integer.parseInt(b)-Integer.parseInt(c));
		for(int i = 0;i < 10;i++) 
		{
			for(int j = 0;j < 10;j++) 
			{
				if(j == letterIndex && (i >= min && i <= max)) 
				{
					x[i][j] = "\u2022";
					System.out.print(x[i][j] + " ");
					count--;
				}
				else
					System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void replaceArrayHorizontal(String a, String b, String c) 
	{
		int letterIndex1 = 1000;
		if(a.equals("A"))
			letterIndex1 = 1;
		if(a.equals("B"))
			letterIndex1 = 2;
		if(a.equals("C"))
			letterIndex1 = 3;
		if(a.equals("D"))
			letterIndex1 = 4;
		if(a.equals("E"))
			letterIndex1 = 5;
		if(a.equals("F"))
			letterIndex1 = 6;
		if(a.equals("G"))
			letterIndex1 = 7;
		if(a.equals("H"))
			letterIndex1 = 8;
		if(a.equals("I"))
			letterIndex1 = 9;
		
		int letterIndex2 = 1000;
		if(b.equals("A"))
			letterIndex2 = 1;
		if(b.equals("B"))
			letterIndex2 = 2;
		if(b.equals("C"))
			letterIndex2 = 3;
		if(b.equals("D"))
			letterIndex2 = 4;
		if(b.equals("E"))
			letterIndex2 = 5;
		if(b.equals("F"))
			letterIndex2 = 6;
		if(b.equals("G"))
			letterIndex2 = 7;
		if(b.equals("H"))
			letterIndex2 = 8;
		if(b.equals("I"))
			letterIndex2 = 9;
		
		int max = letterIndex1;
		int min = letterIndex2;
		if(letterIndex2 > letterIndex1) 
		{
			max = letterIndex2;
			min = letterIndex1;
		}	
			
		int count = Math.abs(letterIndex1 - letterIndex2);
		for(int i = 0;i < 10;i++) 
		{
			for(int j = 0;j < 10;j++) 
			{
				if(i == Integer.parseInt(c) && (j >= min && j <= max)) 
				{
					x[i][j] = "\u2022";
					System.out.print(x[i][j] + " ");
					count--;
				}
				else
					System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean attackArray() 
	{
		hit = false;
		boolean again = true;
		boolean breakthis = false;
		coordinatesX.add(0, 0);
		coordinatesY.add(0, 0);
		while(again) 
		{
			rowCoordinate = (int)(Math.random() * 9 + 1);
			columnCoordinate = (int)(Math.random() * 9 + 1);
			for(int i = 0;i < coordinatesX.size();i++) 
			{
				if(coordinatesX.get(i).equals(rowCoordinate) && coordinatesY.get(i).equals(columnCoordinate)) 
				{
					breakthis = true;
					break;
				}				
				else 
				{
					coordinatesX.add(rowCoordinate);
					coordinatesY.add(columnCoordinate);
					again = false;
				}
			}
			if(breakthis)
				continue;
		}
		if(x[rowCoordinate][columnCoordinate].equals("\u2022")) 
		{
			x[rowCoordinate][columnCoordinate] = "X";
			hit = true;
		}
		else
			x[rowCoordinate][columnCoordinate] = "X";
			
		return hit;
	}
	
	public void printAttack() 
	{
		for(int i = 0;i < 10;i++) 
		{
			for(int j = 0;j < 10;j++) 
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
}
