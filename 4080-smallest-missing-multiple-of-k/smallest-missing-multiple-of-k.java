class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums)set.add(i);
        int i=k;
        //i=i+k;
        while(set.contains(i)){
            i+=k;
        }
        return i;
    }
}