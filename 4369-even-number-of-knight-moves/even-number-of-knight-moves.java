class Solution {
    public boolean canReach(int[] start, int[] target) {
        int fir=(start[0]+start[1])%2;
        int sec=(target[0]+target[1])%2;
        return fir==sec;
    }
}