class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int p=n%10;
            map.put(p,map.getOrDefault(p,0)+1);
            n/=10;
        }
        int mink=Integer.MAX_VALUE;
        int minv=Integer.MAX_VALUE;
        for(int key: map.keySet()){
            int freq=map.get(key);
            if(freq<minv || (freq==minv && key<mink )){
                mink=key;
                minv=freq;
            }
        }
        return mink;
    }
}
