class Solution {
    public int evalRPN(String[] tokens) {
        List <Integer> list=new ArrayList<>();
        List <String> op=new ArrayList<>(Arrays.asList("+","-","*","/"));
        for(String i:tokens){
            if(op.contains(i)){
                int n1=list.remove(list.size()-1);
                int n2=list.remove(list.size()-1);
                if(i.equals("+")){
                    list.add(n2+n1);
                }else if(i.equals("-")){
                    list.add(n2-n1);
                }else if(i.equals("*")){
                    list.add(n2*n1);
                }else if(i.equals("/") && n1!=0){
                    list.add(n2/n1);
                }
            } 
            else{
                list.add(Integer.parseInt(i));
            }
        }
        return list.get(0);
    }
}
