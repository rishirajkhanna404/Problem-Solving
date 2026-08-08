class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid=0;

        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            if(nums[mid]==nums[s] && nums[mid]==nums[e])
            {
                s+=1;
                e-=1;
                continue;
            }
            
            if(nums[mid]>=nums[s]) // left half sorted
            {
                if(target>=nums[s] && target<nums[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else // right half sorted
            {
                if(target>nums[mid] && target<=nums[e])
                {
                    s=mid+1;
                }
                else
                {
                    e=mid-1;
                }
            }
            
        }
        return false;
    }
}
