class Solution {
    public void rec(List<Integer> inList,List<List<Integer>> outList,int target,int[] candidates,int idx,int n)
    {

        if(idx==candidates.length)
        {
            if(target==0)
        {
            outList.add(new ArrayList<>(inList));
        }
             return;
        }

if(candidates[idx]<=target)
{
inList.add(candidates[idx]);
        rec(inList,outList,target-candidates[idx],candidates,idx,n-1);
        // rec(inList,outList,target-candidates[idx],candidates,idx+1,n-1);
        inList.remove(inList.size()-1);
}
        rec(inList,outList,target,candidates,idx+1,n-1);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> inList=new ArrayList<>();
        List<List<Integer>> outList=new ArrayList<>();
        
        rec(inList,outList,target,candidates,0,candidates.length);
        
        return outList;
    }
}
