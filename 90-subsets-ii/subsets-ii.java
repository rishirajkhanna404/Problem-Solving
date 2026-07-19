class Solution {
    public void rec(Set<List<Integer>> ans,List<Integer> list,int[] arr,int i)
    {
       if(i>=arr.length)
       {
         ans.add(new ArrayList<>(list));
         return;
       }
    //    for(int i=idx;i<arr.length;i++)
    //    {
    //      if(i>idx && arr[i]==arr[i-1]){
    //         continue;
    //      }

         rec(ans,list,arr,i+1);

         list.add(arr[i]);
         rec(ans,list,arr,i+1);
         list.remove(list.size()-1);
    //    }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        rec(ans,list,nums,0);

        List<List<Integer>> ansList = new ArrayList<>(ans);

        return ansList;
    }
}