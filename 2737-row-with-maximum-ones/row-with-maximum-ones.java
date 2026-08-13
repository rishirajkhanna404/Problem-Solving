class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRow=-1;
        int maxCount=-1;

        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                 if(mat[i][j]==1)
                 {
                    count+=1;
                 }   
            }
            if(count>maxCount)
            {
                maxCount=count;
                maxRow=i;
            }
        }

        return new int[]{maxRow,maxCount};
    }
}