class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         // 000 , 001 , ....
         
         List<List<Integer>> ans=new ArrayList<>();

         for(int i=0;i<(1<<nums.length);i++)
         {
            int x=i;
         List<Integer> list=new ArrayList<>();

         for(int j=0;j<nums.length;j++)
         {
            if((x & 1)==1)
            {
                list.add(nums[j]);
            }
            x=x>>1;
         }
            ans.add(list);
         } 

         return ans;
    }
}