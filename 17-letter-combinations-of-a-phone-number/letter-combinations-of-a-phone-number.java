class Solution {
    public void solve(List<String> list,Map<Integer,String> map,Integer idx,String ans,String digits)
    {
        if(idx==digits.length())
        {
            list.add(ans);
            return;
        }

        Integer req=digits.charAt(idx)-'0';

        for(int i=0;i<map.get(req).length();i++)
        {
            solve(list,map,idx+1,ans+map.get(req).charAt(i),digits);
        }
    }
    public List<String> letterCombinations(String digits) {
        Map<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        List<String> list=new ArrayList<>();

        solve(list,map,0,"",digits);
        return list;
    }
}