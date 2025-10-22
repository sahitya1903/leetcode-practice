class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<jewels.length();i++){
            char ch2=jewels.charAt(i);
            if(map.containsKey(ch2)){
                c=c+map.get(ch2);
            }
        }return c;
    }
}
