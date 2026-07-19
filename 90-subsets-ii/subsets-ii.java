class Solution {
    public void rec(List<List<Integer>> ans,List<Integer> list,int[] arr,int i)
    {
       if(i>=arr.length)
       {
         ans.add(new ArrayList<>(list));
         return;
       }


         list.add(arr[i]);
         rec(ans,list,arr,i+1);
         list.remove(list.size()-1);

        int idx=i+1;
        while(idx<arr.length && arr[idx]==arr[idx-1])
        {
            idx++;
        }
        rec(ans,list,arr,idx);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        rec(ans,list,nums,0);

        return ans;
    }
}