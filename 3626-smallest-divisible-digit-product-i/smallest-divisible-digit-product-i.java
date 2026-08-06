class Solution {
    public int smallestNumber(int n, int t) {
           while(pro(n)%t!=0){
                n++;
           }
           return n;
    }
    private int pro(int n){
        int mut=1;
        while(n>0){
            mut*=n%10;
            n/=10;
        }
        return mut;
    }
}