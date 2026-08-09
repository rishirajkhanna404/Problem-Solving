class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int minElementInSortedPart=Integer.MAX_VALUE;
        int mid=0;

        while(s<=e)
        {
            mid=s+(e-s)/2;

            if(nums[s]<=nums[e])
            {
                minElementInSortedPart=Math.min(minElementInSortedPart,nums[s]);
               break;
            }
            if(nums[s]<=nums[mid])
            {
                minElementInSortedPart=Math.min(minElementInSortedPart,nums[s]);
                s=mid+1;
            }
            else{
                minElementInSortedPart=Math.min(minElementInSortedPart,nums[mid]);
                e=mid-1;
            }
        }

        return minElementInSortedPart;
    }
}