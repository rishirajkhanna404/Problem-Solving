class Solution {
    public boolean solve(char[][] board,String word,int x,int y,int idx,int m,int n)
    {
        if(idx==word.length())
        {
            return true;
        }

         int[] xd={1,0,0,-1};
         int[] yd={0,1,-1,0};

         char swap=board[x][y];

           for(int i=0;i<4;i++)
           {
            int nx=x+xd[i];
            int ny=y+yd[i];

            if(nx>=0 && ny>=0 && nx<m && ny<n)
            {
                if(board[nx][ny]==word.charAt(idx))
                {
                   board[x][y]='@';
                   if(solve(board,word,nx,ny,idx+1,m,n))
                   {
                    return true;
                   }
                   board[x][y]=swap;
                }
            }
           }

        return false;
    }

    public boolean exist(char[][] board, String word) {

        int m=board.length;
        int n=board[0].length;
        
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(board[i][j]==word.charAt(0) && solve(board,word,i,j,1,m,n))
            {
                return true;
            }
        }
       }
return false;
    }
}