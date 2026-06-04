class Solution {
    public boolean search(int[] nums, int target) {
       HashSet<Integer> s=new HashSet<>();
       for(int i:nums)s.add(i);
       if(s.contains(target)) return true;
       else return false;  
    }
}