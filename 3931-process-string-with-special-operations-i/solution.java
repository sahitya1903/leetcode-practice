class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                res.append(c);
            }else if(c=='*'){
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }
            }else if(c=='#'){
                res.append(res.toString());
            }else{
                res.reverse();
            }
        }
        return res.toString();
    }
}
