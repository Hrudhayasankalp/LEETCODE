class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length,c=0;
        int[] ans=new int[n+1];
        for(int i=0;i<n;i++){
            ans[A[i]]++;
            if(ans[A[i]]==2)c++;
             ans[B[i]]++;
            if(ans[B[i]]==2)c++;
            A[i]=c;
        }
        return A;
    }
}