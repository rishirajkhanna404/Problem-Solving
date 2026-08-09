class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;

        if(nums.length==1)
        {
           return 0;
        }
        else if(nums[0]>nums[1])
        {
            return 0;
        }
        else if(nums[n-1]>nums[n-2])
        {
            return n-1;
        }

        int s=1;
        int e=n-2;
        int mid=0;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid+1]>nums[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }

        return -1;

    }
}