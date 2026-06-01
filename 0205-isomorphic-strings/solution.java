class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] x=new int[256];
        int [] y=new int[256];

        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            char q=t.charAt(i);
            if(x[p]!=y[q]) return false;

            x[p]=i+1;
            y[q]=i+1;
        }
        return true;
    }
}
