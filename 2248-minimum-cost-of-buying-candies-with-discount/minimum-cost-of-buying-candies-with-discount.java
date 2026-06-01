class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0,l=cost.length-1;
        while(l>=0){
            ans=ans+cost[l];
            if(l-1>-1){
                ans=ans+cost[l-1];
                l--;
            }
            l=l-2;
        }
        return ans;
    }
}