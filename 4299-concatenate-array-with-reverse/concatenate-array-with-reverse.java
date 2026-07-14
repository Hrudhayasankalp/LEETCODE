class Solution {
    public int[] concatWithReverse(int[] nums) {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i:nums) list.add(i);
        for(int i=nums.length-1;i>=0;i--)list.add(nums[i]);

        int[] ans=new int[nums.length*2];
        for(int i=0;i<ans.length;i++)ans[i]=list.get(i);
        return ans;
    }
}