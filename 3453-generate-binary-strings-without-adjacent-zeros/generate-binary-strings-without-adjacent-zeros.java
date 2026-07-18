class Solution {
    public void rec(int n,int ones,int zeros,List<String> list,String s)
    {
        if(n==0)
        {
            list.add(s);
            return;
        }

        if(s.length()!=0 && s.substring(s.length()-1).equals("0"))
        {
            rec(n-1,ones+1,zeros,list,s+"1");
        }
        else
        {
            rec(n-1,ones+1,zeros,list,s+"1");
            rec(n-1,ones,zeros+1,list,s+"0");
        }
    }
    public List<String> validStrings(int n) {
        List<String> list=new ArrayList<>();
        rec(n,0,0,list,"");
        return list;
    }
}