Sort an array of 0s, 1s and 2s

class Solution
{
    public static void sort012(int a[], int n)
    {
        int i=0,j=0,k=n-1;
        while(j<=k){
            if(a[j]==1){
                j++;
            }
            else if(a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }else if(a[j]==2){
                int temp=a[k];
                a[k]=a[j];
                a[j]=temp;
                k--;
            }
        }
    }
}

//---------------------------------------------------------------------------------------------------------


class Solution
{
    public static void sort012(int a[], int n)
    {
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
            cnt0++;
            else if(a[i]==1){
                cnt1++;
            }
            else
            cnt2++;
        }
        int k=0;
        for(int i=0;i<cnt0;i++){
            a[k]=0;
            k++;
        }
        for(int i=0;i<cnt1;i++){
            a[k]=1;
            k++;
        }
        for(int i=0;i<cnt2;i++){
            a[k]=2;
            k++;
        }  
    }
}

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
