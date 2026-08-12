class Solution {
    public void rec(int[] candidates,int target,List<List<Integer>> ans,List<Integer> list,int idx)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx==candidates.length)
        {
            return;
        }

        if(candidates[idx]<=target)
        {
            list.add(candidates[idx]);
            rec(candidates,target-candidates[idx],ans,list,idx);
            list.remove(list.size()-1);
        }
        
        rec(candidates,target,ans,list,idx+1);
       
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        rec(candidates,target,ans,list,0);
        return ans;
    }
}