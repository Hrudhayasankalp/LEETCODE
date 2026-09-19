class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr=new int[2];
        for(int i:nums){
            if(set.contains(i)){
                list.add(i);
            }
            else set.add(i);
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}