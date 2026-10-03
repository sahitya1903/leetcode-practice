class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ans=ans+(123-c)*(i+1);
        }
        return ans;
    }
}
