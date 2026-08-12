class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double ans=0;
        for(int i:prices)ans+=i;

        int l=prices.length-1;
        int r=discounts.length-1;

        while(l>=0 && r>=0){
            ans-=(prices[l]*(discounts[r]))/100.0;
            l--;
            r--;
        }
        return ans;
    }

}