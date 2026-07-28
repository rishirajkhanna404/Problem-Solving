class Solution {
    public Boolean isValid(String s)
    {
        int a=0;
        int b=s.length()-1;

        while(a<b)
        {
            if(s.charAt(a)==s.charAt(b))
            {
                a++;
                b--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public void rec(String s,List<List<String>> list,List<String> l,int idx)
    {
        if(idx==s.length())
        {
            list.add(new ArrayList<>(l));
            return;
        }

        String curr="";

        for(int i=idx;i<s.length();i++)
        {
            curr+=s.charAt(i);
            if(isValid(curr))
            {
                l.add(curr);
                rec(s,list,l,i+1);
                l.remove(l.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> l=new ArrayList<>();

        rec(s,list,l,0);
        return list;
    }
}