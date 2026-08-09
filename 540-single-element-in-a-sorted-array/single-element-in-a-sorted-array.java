class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;

        if(nums.length==1)
        {
            return nums[0];
        }
        else if(nums[0]!=nums[1])
        {
            return nums[0];
        }
        else if(nums[n-1]!=nums[n-2])
        {
            return nums[n-1];
        }

        int s=1;
        int e=n-2;
        int mid=0;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            {
                return nums[mid];
            }
            else if(mid%2==0)
            {
                if(nums[mid]==nums[mid+1])
                {
                s=mid+1;
                }
                else
                {
                e=mid-1;
                }
            }
            else if(mid%2==1)
            {
                if(nums[mid]==nums[mid+1])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}