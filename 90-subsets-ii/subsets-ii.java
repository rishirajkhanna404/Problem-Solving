class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> subAns=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<Math.pow(2,n);i++)
        {
            List<Integer> list=new ArrayList<>();
            
            for(int j=0;j<n;j++)
            {
                int x=1<<(n-1-j);
                if((i&x)!=0)
                {
                    list.add(nums[j]);
                }
            }
          subAns.add(list);
        }

        for(List<Integer> y:subAns)
        {
            ans.add(y);
        }
        return ans;
    }
}