class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int MAX=2048; 
        boolean a[]=new boolean[MAX+1]; 
        boolean b[] = new boolean[MAX+1]; 
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                a[nums[i]^nums[j]]=true; 
            }
        }
        int cnt=0; 
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<=MAX;j++) {
                if(a[j]){
                    int x=nums[i]^j; 
                    if(!b[x]) {
                        cnt++; 
                        b[x] = true; 
                    }
                }
            }
        }
        return cnt; 
    }
}