class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> al=new  ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x: nums) map.put(x,map.getOrDefault(x,0)+1);
        for(int k:map.keySet()){
            if( map.get(k)==1 && !map.containsKey(k-1) && !map.containsKey(k+1)) al.add(k);
        }
        return al;        
    }
}