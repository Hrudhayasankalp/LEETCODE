class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int i=0;
       while(i<nums.length){
            if(map.containsKey(nums[i])){
                if(Math.abs(i-map.get(nums[i]))<=k)return true;
            }
            map.put(nums[i],i);
            i++;
       }
       return false;
}
}