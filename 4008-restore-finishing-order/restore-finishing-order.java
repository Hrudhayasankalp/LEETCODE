class Solution {
    public int[] recoverOrder(int[] num, int[] num1) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:num1)set.add(i);

        for(int i:num){
            if(set.contains(i))list.add(i);
        }
        int[] ans=new int[num1.length];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}