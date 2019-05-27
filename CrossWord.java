public class CrossWord {

	public static final char[][] board = {
			{'a','p','o','l'},
			{'n','x','g','o'},
			{'v','y','i','v'},
			{'o','r','s','e'}
			};

    public static void main(String[] args) {

		System.out.println(checkSeq(0,0,"apolo",0));
        
    }
    
    public static int checkSeq(int row, int col, String str, int index)
    {
	
		if(isValidCell(row, col)==0)
			return 0;
	
		if(index==str.length()-1 && board[row][col]==str.charAt(index))
			return 1;
		else if(board[row][col]==str.charAt(index))
		{
		    if(checkSeq(row+1, col, str,index+1)==1)
				return 1;
			if(checkSeq(row, col+1, str,index+1)==1)
				return 1;
		}
		else
		{
		    if(checkSeq(row+1, col, str,0)==1)
				return 1;
			if(checkSeq(row, col+1, str,0)==1)
				return 1;
		}
		return 0;
    }
    
    public static int isValidCell(int r, int c)
    {
		return (r<4 && c<4)?1:0;
    }
}









