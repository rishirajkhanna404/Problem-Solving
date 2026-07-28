class Solution {
    public Boolean isSafe(int x,int y,List<String> list,int n)
    {
        for(int i=0;i<list.size();i++)
        {
            String str=list.get(i);
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='Q')
                {
                    if((x==i) || (y==j) || Math.abs(x-i)==Math.abs(y-j))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void solve(int n,List<String> list,List<List<String>> ansList,int idx)
    {
        if(idx==n)
        {
            ansList.add(new ArrayList<>(list));
            return;
        }

        char[] chars=new char[n];
        Arrays.fill(chars,'.');

        for(int y=0;y<n;y++)
        {
              if(isSafe(idx,y,list,n))
              {
                chars[y]='Q';
                list.add(new String(chars));
                solve(n,list,ansList,idx+1);
                chars[y]='.';
                list.remove(list.size()-1);
              }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ansList=new ArrayList<>();
        List<String> list=new ArrayList<>();
        if(n==1)
        {
            list.add("Q");
            ansList.add(list);
        }
        else
        {

        solve(n,list,ansList,0);
        }
        return ansList;
    }
}