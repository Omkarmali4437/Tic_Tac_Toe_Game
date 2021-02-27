import java.util.Scanner;

class TicTacToe
{
	static char[] board;
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

	public void First_move(int position)
	{
		char p=player.charAt(0);
		char c=computer.charAt(0);
		board[position]=p;
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

		System.out.println("Enter the position you want to start between 1-9: ");
		int position=sc.nextInt();
		tictac.First_move(position);

		tictac.showboard();
   }
}

