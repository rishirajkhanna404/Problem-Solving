class Solution {
    
    public void solve(String num,int target,List<String> list,int idx,String ans,long prev,long result)
    {
        if(idx==num.length())
        {
            if(result==target)
            {
              list.add(ans);
            }
            return;
        }

        String curr="";
        long currResult=0;

        for(int i=idx;i<num.length();i++)
        {
            if(i>idx && num.charAt(idx)=='0'){
                break;
            }
        
           curr+=num.charAt(i);
           currResult=currResult*10+(num.charAt(i)-'0');
           
           if(idx==0)
           {
              solve(num,target,list,i+1,curr,currResult,currResult);
           }
           else
           {
             solve(num,target,list,i+1,ans+'+'+curr,currResult,result+currResult);
             solve(num,target,list,i+1,ans+'-'+curr,-currResult,result-currResult);
             solve(num,target,list,i+1,ans+'*'+curr,prev*currResult,result-prev+prev*currResult);
           }
        }
    }

    public List<String> addOperators(String num, int target) {
        int idx=0;
        List<String> list=new ArrayList<>();
        solve(num,target,list,idx,"",0,0);
        return list;
    }
}




