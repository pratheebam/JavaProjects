import java.util.Scanner;
public class ChessBoard
{
	public static void main(String args[])
	{
		String board[][] = new String[8][8];
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int i,row,col,r1,c1;
		
		init(board);
		
		// for knight...
		
		for(i=0;i<count;i++)
		{
			row = sc.nextInt() - 1;
			col = sc.nextInt() - 1;
			
			markCell(board,row-1,col-2,i);
			markCell(board,row-2,col-1,i);

			markCell(board,row+1,col-2,i);
			markCell(board,row+2,col-1,i);

			markCell(board,row-1,col+2,i);
			markCell(board,row-2,col+1,i);

			markCell(board,row+1,col+2,i);
			markCell(board,row+2,col+1,i);
			
		}
		
		
			row = sc.nextInt()-1;
			col = sc.nextInt()-1;
		
			markCell(board,row, col+1,i);
			markCell(board,row, col-1,i);
			markCell(board,row+1, col,i);
			markCell(board,row-1, col,i);
			markCell(board,row+1, col+1,i);
			markCell(board,row+1, col-1,i);
			markCell(board,row-1, col+1,i);
			markCell(board,row-1, col-1,i);
		
		
		//display board ...
		display(board);
	}
	
	public static void markCell(String in[][], int r, int c, int m)
	{
		if((r>=0 && r<=7) && (c>=0 && c<=7))
		{
			in[r][c] = in[r][c] + Integer.toString(m);
		}
	}
	
	public static void display(String in[][])
	{
		int i,j;
		for(i=0;i<8;i++)
		{
			for(j=0;j<8;j++)
			{
				System.out.print(in[i][j] + "\t|");
			}
			System.out.println();
		}
	}
	
	public static void init(String in[][])
	{
		int i,j;
		for(i=0;i<8;i++)
		{
			for(j=0;j<8;j++)
			{
				in[i][j] = " ";
			}
		}
	}
}