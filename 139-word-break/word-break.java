class Solution {
    public Boolean rec(String s,List<String> wordDict,int idx,Boolean[] memo)
    {
        if(idx==s.length())
        {
            return true;
        }

        if(memo[idx]!=null)
        {
            return memo[idx];
        }

        String curr="";

        for(int i=idx;i<s.length();i++)
        {
            curr+=s.charAt(i);
            if(wordDict.contains(curr))
            {
                if(rec(s,wordDict,i+1,memo))
                {
                    memo[idx]=true;
                    return true;
                }
            }
        }
        
        memo[idx]=false;
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
                Boolean[] memo = new Boolean[s.length()];

        return rec(s,wordDict,0,memo);
    }
}

