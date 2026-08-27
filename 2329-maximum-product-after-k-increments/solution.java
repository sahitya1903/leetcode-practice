class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        double mod=Math.pow(10,9)+7;
        while(k>0){
            int num=pq.peek();
            pq.remove();
            pq.add(num+1);
            k--;
        }
        double ans=1;
        while(!pq.isEmpty()){
            int num=pq.peek();
            pq.remove();
            ans=(ans*num) % mod;
        }
        return (int)(ans%mod);
    }
}
