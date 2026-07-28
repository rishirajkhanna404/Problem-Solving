class Solution {
    public void solve(Boolean[] memo,int idx,Set<String> set,String s,List<String> ans,List<String> currList)
    {
       if(idx==s.length())
       {
        String str="";
          for(int i=0;i<currList.size()-1;i++)
          {
            str=str+currList.get(i);
            str+=" ";
          }
          if(currList.size()!=0)
          {
            str+=currList.get(currList.size()-1);
          }

        ans.add(str);
        return;
       }

       String curr="";
       for(int i=idx;i<s.length();i++)
       {
         curr+=s.charAt(i);
         if(set.contains(curr))
         {
            currList.add(curr);
            solve(memo,i+1,set,s,ans,currList);
            currList.remove(currList.size()-1);
         }
       }
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list=new ArrayList<>();
        List<String> currList=new ArrayList<>();

        Set<String> set=new HashSet<>();
        for(int i=0;i<wordDict.size();i++)
        {
            set.add(wordDict.get(i));
        }

        Boolean[] memo=new Boolean[s.length()];

        solve(memo,0,set,s,list,currList);
        return list;
    }
}