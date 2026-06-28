class Solution {
    public int compress(char[] chars) {
        int read=0,write=0;

        while(read<chars.length){
            char current=chars[read];
            int count=0;

            while(read<chars.length && chars[read]==current){
                read++;count++;
            }
            
            chars[write++]= current;
            
            if(count>1){
                for(char i: String.valueOf(count).toCharArray()){
                    chars[write++]=i;
                }
            }
        }
        return write;
    }
}
