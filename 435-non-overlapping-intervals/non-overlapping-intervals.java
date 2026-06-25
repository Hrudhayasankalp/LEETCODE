class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        ArrayList<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        int cnt=0;
        for(int i=1;i<intervals.length;i++){
            int last[]=list.get(list.size()-1);
            if(intervals[i][0]<last[1]){
                cnt++;
            }
            else list.add(intervals[i]);
        }
        return cnt;
    }
}