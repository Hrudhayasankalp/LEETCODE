class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:word.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> f=new ArrayList<>(map.values());
        Collections.sort(f, Collections.reverseOrder());
        int ans = 0;
        for (int i=0;i<f.size();i++) {
            ans+=f.get(i)*(i / 8 + 1);
        }
        return ans;
    }
}