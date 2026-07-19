class Solution {
    
    public void rec(int[] arr,List<List<Integer>> ans,List<Integer> list,int k,int target,int idx){

         if(list.size()==k)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(idx==arr.length)
        {
            return;
        }

       

        if(arr[idx]<=target)
        {
            list.add(arr[idx]);
             rec(arr,ans,list,k,target-arr[idx],idx+1);
             list.remove(list.size()-1);
        }
        rec(arr,ans,list,k,target,idx+1);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4,5,6,7,8,9};

        rec(arr,ans,list,k,n,0);
return ans;
    }
}