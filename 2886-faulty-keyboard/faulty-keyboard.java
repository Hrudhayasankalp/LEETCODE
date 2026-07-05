class Solution {
    public String finalString(String x) {
        StringBuilder sb=new StringBuilder();
        for(char s:x.toCharArray()){
            if(s=='i'){
                sb.reverse();
            }
            else sb.append(s);
        }
        return sb.toString();
    }
}