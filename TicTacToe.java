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

		tictac.printboard();
   }
}

