class Solution {
    public Boolean isInSetBitGroup(int n,int rightMost)
    {
        if((n & rightMost) != 0)
        {
            return true;
        }
        return false;
    }

    public int[] singleNumber(int[] nums) {
        int x=0;

        for(int i=0;i<nums.length;i++)
        {
            x^=nums[i];
        }

        int rightMostSetBit= (x&(x-1))^x;
        
        int rightMostSetBitGroup=0;
        int notRightMostGroup=0;

        for(int i=0;i<nums.length;i++)
        {
            if(isInSetBitGroup(nums[i],rightMostSetBit))
            {
                rightMostSetBitGroup^=nums[i];
            }
            else{
                notRightMostGroup^=nums[i];
            }
        }

      return new int[]{rightMostSetBitGroup, notRightMostGroup};

    }
}