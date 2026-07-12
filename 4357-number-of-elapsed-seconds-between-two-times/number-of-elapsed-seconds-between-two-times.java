class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return time(endTime)-time(startTime);
    }
    int time(String n){
        int h=Integer.parseInt(n.substring(0,2));
        int m=Integer.parseInt(n.substring(3,5));
        int s=Integer.parseInt(n.substring(6,8));
        return h*60*60+m*60+s;
    }
}