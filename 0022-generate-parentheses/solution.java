class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder(2*n);
        backtrack(sb,0,0,n,list);
        return list;
    }
    public void backtrack(StringBuilder sb, int open, int close, int n, List<String> list){
        if(sb.length()==2*n){
            list.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            backtrack(sb,open+1,close,n,list);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(')');
            backtrack(sb,open,close+1,n,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
