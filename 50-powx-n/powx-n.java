class Solution {
    public double pow(double x,int n)
    {
       if(n==0)
       {
        return 1;
       }   

       double ans=pow(x,n/2);

       if(n%2==0)
       {
        return ans*ans;
       }

       return x*ans*ans;
    }

    public double myPow(double x, int n) {
        Boolean neg=false;
        if(x<0)
        {
            x*=-1;
            neg=true;
        }

        double ans=0;
        
        if(n<0)
        {
            ans=pow(1/x,n);
        }
        else
        {
           ans=pow(x,n);
        }

        if(neg && n%2!=0)
        {
            return ans*(-1);
        }

        return ans;
    }
}
