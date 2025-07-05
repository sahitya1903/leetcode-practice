class Solution {
    public String concatHex36(int n) {
        String hex="",hex2="";
        int a=n*n,b=n*n*n;
        
        if(a==0) hex="0";
        while(a>0){
            int rem=a%16;
            if(rem>9){
                hex=(char)('A'+rem-10)+hex;
            }else{
                hex=(char)('0'+rem)+hex;
            }
            a/=16;
        }

        if(b==0) hex2="0";
        while(b>0){
            int rem2=b%36;
            if(rem2>9){
                hex2=(char)('A'+rem2-10)+hex2;
            }else{
                hex2=(char)('0'+rem2)+hex2;
            }
            b/=36;
        }
        return hex+hex2;
    }
}
