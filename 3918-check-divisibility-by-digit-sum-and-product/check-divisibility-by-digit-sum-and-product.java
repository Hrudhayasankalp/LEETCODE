class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1,rem=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        return temp%(sum+pro)==0;
    }
}