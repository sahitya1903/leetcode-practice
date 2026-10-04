class Solution {
    public boolean checkValidString(String s) {
        int max_open=0;
        int min_open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                max_open++;
                min_open++;
            }
            else if(ch==')') {
                max_open--;
                min_open--;}
            else{
                max_open++;
                min_open--;
            }
            if(max_open<0) return false;
            if(min_open<0) min_open=0;
        }
        return min_open==0;   
    }
}
