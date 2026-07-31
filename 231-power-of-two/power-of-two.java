class Solution {
    public boolean isPowerOfTwo(int n) {
       // number of set bit should be 1

       if(n<0)
       {
         return false;
       }

       int count=0;
       while(n!=0)
       {
          if((n & 1)==1)
          {
            count+=1;
          }
          n=n>>1;
       }

       return count==1;
    }
}