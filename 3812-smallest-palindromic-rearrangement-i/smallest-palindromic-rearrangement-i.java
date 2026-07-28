class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int m=n/2;
        if (n==1||n==2) return s;
        char[] ans=s.substring(0, m).toCharArray();
        Arrays.sort(ans);
        String f=new String(ans);
        StringBuilder sb=new StringBuilder(f).reverse();
        if (n%2==1){
            f+=s.charAt(m);
        }
        return f + sb.toString();
    }
}