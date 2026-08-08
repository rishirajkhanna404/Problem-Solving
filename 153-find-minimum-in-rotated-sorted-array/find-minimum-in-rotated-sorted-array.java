class Solution {
    public int findMin(int[] nums) {

        if(nums.length==1)
        {
            return nums[0];
        }
        int s=0;
        int e=nums.length-1;
        int mid=0;
        int n=nums.length;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(nums[mid]<nums[(mid-1+n)%n] && nums[mid]<nums[(mid+1)%n])
            {
                return nums[mid];
            }
            else if(nums[s]<=nums[mid] && nums[mid]>nums[(mid+1)%n])
            {
                return nums[(mid+1)%n];
            }
            else if(nums[mid]>nums[(mid-1+n)%n] && nums[mid]<nums[(mid+1)%n])
            {
                if(nums[s]<=nums[mid])
                {
                    s=mid+1;
                }
                else 
                {
                    e=mid-1;
                }
            }
        }
        return nums[s];
    }
}



