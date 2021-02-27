class TicTacToe
{
	static char[] board;

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

		tictac.printboard();
   }
}

