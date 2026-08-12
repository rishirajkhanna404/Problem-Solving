class Solution {
    public int isPossible(int[] nums,int mid)
    {
        int currSplitCount=1;
        int currSum=0;
        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];
            if(currSum>mid)
            {
                currSum=nums[i];
                currSplitCount+=1;
            }
        }

        return currSplitCount;
    }
    public int splitArray(int[] nums, int k) {
        int s=Arrays.stream(nums).max().getAsInt();
        int e=0;
        for(int x:nums)
        {
            e+=x;
        }
        int mid=0;
        int ans=0;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(isPossible(nums,mid)<=k)
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