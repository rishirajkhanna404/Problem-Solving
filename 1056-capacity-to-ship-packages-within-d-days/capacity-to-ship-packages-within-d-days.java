class Solution {
    public boolean isPossible(int mid,int[] weights,int days)
    {
        int currDays=0;
        int currWeight=0;

        for(int i=0;i<weights.length;i++)
        {
            currWeight+=weights[i];
            if(currWeight>mid)
            {
                currWeight=weights[i];
                currDays+=1;
                if(currDays>days || currWeight>mid)
                {
                    return false;
                }
            }
        }
        currDays+=1;
        if(currDays>days)
        {
            return false;
        }

        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s= Arrays.stream(weights).min().getAsInt();   
        int e=0;
        for(int i=0;i<weights.length;i++)
        {
            e+=weights[i];
        }

        int ans=e;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(isPossible(mid,weights,days))
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