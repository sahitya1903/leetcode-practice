class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int tot=0;
        for(int i=0;i<n;i++){
            char ch=columnTitle.charAt(n-i-1);
            int pos=ch-'0'-16;
            tot=tot+pos*(int)Math.pow(26,i);
        }
       return tot; 
    }
}
