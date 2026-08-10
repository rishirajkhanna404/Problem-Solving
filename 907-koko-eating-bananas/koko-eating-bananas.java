class Solution {
    public boolean isPossible(long mid,int[] piles,int h)
    {
        long currHours=0;
        for(int i=0;i<piles.length;i++)
        {
            currHours = currHours + (piles[i]/mid);
            currHours = currHours + (((piles[i]%mid)==0)?0:1);

            if(currHours>h)
            {
                return false;
            }
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        long s=1;
        long e=0;

        for(int p:piles)
        {
            e+=p;
        }

        long mid=0;
        long ans=e;

        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(isPossible(mid,piles,h))
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }

        return (int)ans;
    }
}