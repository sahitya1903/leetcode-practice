class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower=new HashSet<>();
        Set<Character> upper=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)) lower.add(c);
            else upper.add(c);
        }
        
        int res=0;
        for(char i:lower){
            if(upper.contains(Character.toUpperCase(i))) res++;
        }

        return res;
    }
}
