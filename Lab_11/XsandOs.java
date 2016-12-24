public class XsandOs
{
	public static void main(String[]args)
	{
		String[][] XandO = new String [4][4];
		
		int pick = 0;
		for (int i = 0; i < XandO.length;i++)
		{
			for (int j = 0; j < XandO[i].length;j++)
			{
				pick = (int)(Math.random() * 2);
				
				if (pick == 1)
					XandO[i][j] = "X";
				else
				{
					XandO[i][j] = "O";
				}
				System.out.print(XandO[i][j]);
			}
			System.out.println();
		}
	}
}