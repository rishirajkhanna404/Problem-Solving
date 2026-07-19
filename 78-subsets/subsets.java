class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int size=(1<<n)-1;

        for(int i=0;i<=size;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=n-1;j>=0;j--)
            {
                if(((1<<j)&i)!=0)
                {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        
        return ans;
    }
}