class Solution {
    public int countDistinctIntegers(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int i:nums ){
        int a=reverse(i);
        set.add(a);
        set.add(i);
       }
       return set.size();

    }
    private int reverse(int n){
        int rem=0,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}