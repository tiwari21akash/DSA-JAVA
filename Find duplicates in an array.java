Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> ans=new  ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1] && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
        
    }
}

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
Explanation: 2 and 3 occur more than once
in the given array.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
