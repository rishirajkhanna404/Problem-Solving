class Solution {
    public int findKthPositive(int[] arr, int k) {

        int s=0;
        int e=arr.length-1;
        int mid=0;

        while(s<=e)
        {
            mid=s+(e-s)/2;
            
            if((arr[mid]-mid-1)<k)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }

        return k+e+1             ; // arr[e]+more -> more = k-(arr[e]-e-1) 
    }
}
