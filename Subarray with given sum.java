Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int sum=0,st=0,en=0;
        for(int i=0;i<n;i++){
            sum+=arr[en];
            if(sum==s){
                ans.add(st+1);
                ans.add(en+1);
                break;
            }else if(sum>s){
                i=st++;
                en=st;
                sum=0;
            }else{
                en++;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
