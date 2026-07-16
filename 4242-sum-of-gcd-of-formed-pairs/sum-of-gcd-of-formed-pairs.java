class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        int mx=0;
        for(int i=0;i<n;i++) {
            mx=Math.max(mx,nums[i]);
            list.add(gcd(nums[i],mx));
        }
        Collections.sort(list);
        long sum=0;
        int i=0;
        int j=n-1;
        while(i<j) {
            sum+=gcd(list.get(i),list.get(j));
            i++;
            j--;
        }
        return sum;
    }
    int gcd(int a,int b) {
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}