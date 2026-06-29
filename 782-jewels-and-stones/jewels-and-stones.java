class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
        for(char i:jewels.toCharArray())set.add(i);
        int cnt=0;
        for(char i:stones.toCharArray()){
            if(set.contains(i))cnt++;
        }
        return cnt;
    }
}