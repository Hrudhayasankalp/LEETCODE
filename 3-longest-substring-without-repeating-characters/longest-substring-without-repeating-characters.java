class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> m=new HashSet<>();
        int i=0,j=0,cnt=0;
        while(j<s.length()){
            if(!m.contains(s.charAt(j))){
                m.add(s.charAt(j));
                cnt=Math.max(cnt,j-i+1);
                j++;
            }
            else {
                m.remove(s.charAt(i));
                i++;
            }
        }
        return cnt;
    }
}