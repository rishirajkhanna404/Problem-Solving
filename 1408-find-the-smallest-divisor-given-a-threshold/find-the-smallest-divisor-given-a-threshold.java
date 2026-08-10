class Solution {
    public boolean isPossible(int[] nums,int threshold,int mid)
    {
        int currThreshold=0;
        for(int i=0;i<nums.length;i++)
        {
           double a=(double)nums[i]/mid;
           int b=(int) a;
           if(a>b)
           {
            currThreshold+=(b+1);
           }
           else
           {
            currThreshold+=b;
           }
        }
        if(currThreshold>threshold)
        {
            return false;
        }
        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=Arrays.stream(nums).max().getAsInt();

        int mid=0;
        int ans=e;

        while(s<=e)
        {
            mid=s+(e-s)/2;
            
            if(isPossible(nums,threshold,mid))
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