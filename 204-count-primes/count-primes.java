class Solution {
    public int countPrimes(int n) {

        int count=0;
        int[] arr=new int[n];

        Arrays.fill(arr,1);

        for(int i=2;i*i<=n;i++)
        {
             if(arr[i]==1)
             {
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=0;
                }
             }
        }

        for(int i=2;i<n;i++)
        {
            if(arr[i]==1)
            {
                // System.out.println(i);
count+=1;
            }
        }
return count;
    }
}
