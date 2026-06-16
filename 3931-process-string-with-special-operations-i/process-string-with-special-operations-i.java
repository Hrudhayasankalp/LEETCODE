class Solution {
    public String processStr(String s) {
        int i=0,j=s.length()-1;
        StringBuilder h=new StringBuilder();
        while(i<=j){
            if(s.charAt(i)=='*'){
                if(h.length()>0){h.deleteCharAt(h.length()-1);}}
            else if(s.charAt(i)=='#')h.append(h.toString());
            else if(s.charAt(i)=='%')h.reverse();
            else h.append(s.charAt(i));
            i++;
        }
        return h.toString();
    }
}