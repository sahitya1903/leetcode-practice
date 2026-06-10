class Solution {
    public boolean isSelfDividing(int n){
        int x=n;
        while(x>0){
            int d=x%10;
            if(d==0 || n%d!=0) return false;
            x/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) { 
        List <Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)) list.add(i);
        }
        return list;
    }
}
