class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }

        List<Integer> list=new ArrayList<>();
        for(int x: order){
            if(set.contains(x)) list.add(x);
        }

        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
