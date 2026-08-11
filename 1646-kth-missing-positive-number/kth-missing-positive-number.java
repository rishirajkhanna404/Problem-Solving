class Solution {
    public int findKthPositive(int[] arr, int k) {

       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]<=k)
        {
            k+=1;
        }
        else
        {
            return k;
        }
       }
       
       return k;

        // int s=0;
        // int e=arr.length-1;
        // int mid=0;
        // int ans=0;

        // while(s<=e)
        // {
        //     mid=s+(e-s)/2;
            
        //     if(arr[mid]-mid==k)
        //     {
        //         ans=mid;
        //         break;
        //     }
        //     else if(arr[mid]-mid>k)
        //     {
        //         ans=mid;
        //         e=mid-1;
        //     }
        //     else if((arr[mid]-mid)<k)
        //     {
        //         s=mid+1;
        //     }
        // }

        // if(s>e)
        // {
        //    return arr[arr.length-1]+k;
        // }
        // else if(mid>0)
        // {
        //    return arr[mid-1]+((arr[mid]-mid)-(arr[mid-1]-(mid-1)));
        // }
        // return ((arr[mid]-mid)-(arr[mid-1]-(mid-1)));
    }
}
