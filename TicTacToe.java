import java.util.Scanner;

class TicTacToe
{
	static char[] board;
	//Constats
	public static final int Heads=1;
	public static final int Tails=0;
	//Variables
	public static String computer;
	public static String player;

	public static String assign(String symbol)
	{
		if(symbol.equals("X"))
		{
			player="X";
			computer="O";
		}
		else if(symbol.equals("O"))
		{
			player="O";
			computer="X";
		}
		else
		{
			System.out.println("Wrong input");
		}
		return computer;

	}

	public void printboard()
	{
		for(int i=1;i<10;i++)
		{
			board[i]=' ';
			System.out.println(board[i]);
		}
	}

	public void showboard()
	{
		System.out.println(board[1] + " | "+ board[2] + " | " +  board[3]);
		System.out.println("--------");
		System.out.println(board[4] + " | "+ board[5] + " | " +  board[6]);
		System.out.println("--------");
		System.out.println(board[7] + " | "+ board[8] + " | " +  board[9]);
	}

	public void First_move(int position,int cposition)
	{
		char p=player.charAt(0);
		char c=computer.charAt(0);
		board[position]=p;
		if(board[cposition] == 0)
		{
			board[cposition]=c;
		}
		else if(board[cposition] != 0)
		{
			int cposition1 = (int)Math.floor(Math.random() * (10-1))+1;
			board[cposition1]=c;
		}
	}

	public void Start_move()
	{
		int Toss = (int)Math.floor(Math.random() * 10)%2;
		System.out.println("Toss is: "+Toss);
		switch(Toss)
		{
			case Heads:
				System.out.println("User won the toss it is Heads. So user starts first.");
				break;
			case Tails:
				System.out.println("Computer won the toss it is Tails. So computer starts first.");
			break;
		}
	}

	public static void main(String[] args)
	{
		TicTacToe tictac=new TicTacToe();
		board= new char[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice X|O");
		String symbol=sc.next();
		tictac.assign(symbol);
		System.out.println("Player is: "+player);
		System.out.println("Computer is: "+computer);

		tictac.Start_move();

   }
}

