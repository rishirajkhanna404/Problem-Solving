class Solution {
    public void rec(int k,int n,int idx,List<List<Integer>> ans,List<Integer> list)
    {
        if(k==0)
        {
            if(n==0)
            {
               ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(idx==9)
        {
          return;   
        }

        list.add(idx+1);
        rec(k-1,n-idx-1,idx+1,ans,list);
        list.remove(list.size()-1);

        rec(k,n,idx+1,ans,list);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        rec(k,n,0,ans,list);
        return ans;
    }
}