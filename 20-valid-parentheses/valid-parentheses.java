class Solution {
    public boolean isValid(String s) {
        Deque<Character> beg=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char h=s.charAt(i);
            if(h=='(' || h=='[' || h=='{') beg.push(h);
            else{
                if(beg.isEmpty())return false;
                if(h==')'&&beg.pop()!='(' || h==']'&&beg.pop()!='[' || h=='}'&&beg.pop()!='{')return false;
            } 
        }
       return beg.isEmpty();
    }
}