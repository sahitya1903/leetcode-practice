class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        String str;
        if(n>h){
            return -1;
        }
        for(int i=0;i<=h-n;i++){
            str=haystack.substring(i,i+n);
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
