class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[') sb.append(c);
            else {
                if(sb.length()==0) return false;

                int last=sb.length()-1;
                if((c==']' && sb.charAt(last)=='[') || 
                    (c=='}' && sb.charAt(last)=='{') || 
                    (c==')' && sb.charAt(last)=='(')){
                    sb.deleteCharAt(last);
                }else{
                    return false;
                }
            }
        }
        return sb.length()==0;
    }
}
