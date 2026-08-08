class Solution {
    public int bs(int[] nums,int s,int e,int target)
    {
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                s=mid+1;
            }
            else if(nums[mid]>target)
            {
                e=mid-1;
            }
        }
        return -1;
    }

    public int findPeek(int[] nums)
    {
        int s=0;
        int e=nums.length-1;
        int mid=0;
        int n=nums.length;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if((nums[(mid-1+n)%n])>nums[mid] && nums[mid]<nums[(mid+1)%n])
            {
                return mid;
            }
            else if(nums[(mid-1+n)%n]<nums[mid] && nums[(mid+1)%n]<nums[mid])
            {
                return (mid+1)%n;
            }
            else if(nums[(mid-1+n)%n]<nums[mid] && nums[(mid+1)%n]>nums[mid])
            {
                if(nums[s]<nums[mid])
                {
                   s=mid+1;
                }
                else{
                   e=mid-1;
                }
            }
        }

        return s;
    }

    public int search(int[] nums, int target) {
        if(nums.length==1)
        {
            if(nums[0]!=target)
            {
                return -1;
            }
            return 0;
        }
        int peek=findPeek(nums);
        System.out.println(peek);
        int a=-1;
        if(peek>0)
        {
            a=bs(nums,0,peek-1,target);
        }
        int b=bs(nums,peek,nums.length-1,target);

        if(a!=-1)
        {
            return a;
        }
        return b;
    }
}





