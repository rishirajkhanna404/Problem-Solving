class Solution {
    public void rec(int[] nums,List<List<Integer>> ans,List<Integer> list,int idx)
    {
        ans.add(new ArrayList<>(list));

        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1])
            {
                continue;
            }

            list.add(nums[i]);
            rec(nums,ans,list,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        
        rec(nums,ans,list,0);
        return ans;
    }
}