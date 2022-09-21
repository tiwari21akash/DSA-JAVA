class Solution {
    int MissingNumber(int array[], int n) {
        int xor=array[0];
        int sum=0;
        for(int i=1;i<n-1;i++){
            xor=xor^array[i];
        }
        for(int i=1;i<=n;i++){
            sum=sum^i;
        }
        return xor^sum;
    }
}

//-------------------------------------------------------------------------------------

class Solution {
    int MissingNumber(int array[], int n) {
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2=sum2+array[i];
        }
        
        return sum1-sum2;
    }
}

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
