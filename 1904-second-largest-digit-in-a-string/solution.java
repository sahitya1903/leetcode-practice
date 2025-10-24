class Solution {
    public int secondHighest(String s) {
        int max1=-1;
        int max2=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=Integer.parseInt(ch+"");
                if(num>max1){
                    max2=max1;
                    max1=num;
                }else if(num<max1 && num>max2){
                    max2=num;
                }
            }
        }return max2;
    }
}
