class Solution {

    public void rec(int[] arr,int k,int idx,List<Integer> list,List<List<Integer>> ans)
    {
        if (k == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (idx == arr.length || k < 0)
        {
            return;
        }

        for(int i=idx;i<arr.length;i++)
        {
           if(i>idx && arr[i]==arr[i-1])
           {
            continue;
           }

        if(arr[i]<=k)
        {
            list.add(arr[i]);
            rec(arr,k-arr[i],i+1,list,ans);
            list.remove(list.size()-1);
        }

        }
        
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        rec(candidates,target,0,list,ans);
        return ans;
    }
}
