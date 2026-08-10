class Solution {
    public void rec(String s,List<String> ans,int idx,String str)
    {
        if(idx==s.length())
        {
            ans.add(str);
            return;
        }
        if((s.charAt(idx)>='a' && s.charAt(idx)<='z')||(s.charAt(idx)>='A' && s.charAt(idx)<='Z'))
        {
          char x=Character.toLowerCase(s.charAt(idx));
          char y=Character.toUpperCase(x);

          rec(s,ans,idx+1,str+x);
          rec(s,ans,idx+1,str+y);
        }
        else
        {
          rec(s,ans,idx+1,str+s.charAt(idx));
        }
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        rec(s,ans,0,"");
        return ans;
    }
}