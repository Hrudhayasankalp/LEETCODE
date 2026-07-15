class Solution {
    public int gcdOfOddEvenSums(int n) {
        //int sum=0,sum1=0;
        int even=n*(n+1);
        int odd=n*n;
        int ans=gcd(even,odd);
        return ans;
    }
    int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}