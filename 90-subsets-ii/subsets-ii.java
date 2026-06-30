class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
            sets(0,nums,new ArrayList<>(),ans);
            return ans;
    }
    static void sets(int idx,int[] nums,List<Integer> temp,List<List<Integer>>ans){
        if(idx>=nums.length){
            if(!ans.contains(temp))
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[idx]);
        sets(idx+1,nums,temp,ans);
        temp.remove(temp.size()-1);
        sets(idx+1,nums,temp,ans);
    }
}