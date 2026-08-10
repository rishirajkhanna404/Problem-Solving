class Solution {
    public boolean isPossible(int mid,int[] bloomDay,int m,int k)
    {
        int currCount=0;
        int currBouquets=0;

        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=mid)
            {
                currCount+=1;
            }
            else
            {
                currBouquets+=currCount/k;
                currCount=0;
            }
        }

        currBouquets+=currCount/k;
        if(currBouquets<m)
        {
            return false;
        }
        return true;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k)>bloomDay.length)
        {
            return -1;
        }
        int s=Arrays.stream(bloomDay).min().getAsInt();
        int e=Arrays.stream(bloomDay).max().getAsInt();

        int mid=0;
        int ans=-1;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(isPossible(mid,bloomDay,m,k))
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }

        return ans;
    }
}