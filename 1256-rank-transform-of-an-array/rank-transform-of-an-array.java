class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] num=arr.clone();
        Arrays.sort(num);
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=1;
        for(int i=0;i<num.length;i++){
           if(!map.containsKey(num[i]))map.put(num[i],c++);
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}