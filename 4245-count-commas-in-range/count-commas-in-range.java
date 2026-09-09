class Solution {
    public int countCommas(int n) {
        int cnt=0;
        if(n<1000)return cnt;
        else{
            for(int i=1000;i<=n;i++){
                cnt++;
            }
        }
        return cnt;
    }
}