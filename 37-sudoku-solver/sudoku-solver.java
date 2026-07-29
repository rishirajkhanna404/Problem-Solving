class Solution {
    public Boolean isValid(int x,int y,char[][] board,char z)
    {
       int sx=(x/3)*3;
       int sy=(y/3)*3;

       for(int i=0;i<board.length;i++)
       {
        if(board[i][y]==z)
        {
            return false;
        }
       }

       for(int j=0;j<board.length;j++)
       {
        if(board[x][j]==z)
        {
            return false;
        }
       }

        for(int i=sx;i<=sx+2;i++)
        {
            for(int j=sy;j<=sy+2;j++)
            {
                if(board[i][j]==z)
                {
                    return false;
                }
            }
        }

        return true;
    }

    public Boolean solve(char[][] board,int x,int y,int n)
    {
        if(x==n)
        {
            return true;
        }

        if(y==n)
        {
            return solve(board,x+1,0,n);
        }

        if(board[x][y]!='.')
        {
            return solve(board,x,y+1,n);
        }

        for(char j='1';j<='9';j++)
        {
            if(isValid(x,y,board,j))
            {
               board[x][y]=j;
               if(solve(board,x,y+1,n))
               {
                return true;
               }
            }
        }
        
        board[x][y]='.';
        return false;
    }

    public void solveSudoku(char[][] board) {

        solve(board,0,0,board.length);

        return;
    }
}