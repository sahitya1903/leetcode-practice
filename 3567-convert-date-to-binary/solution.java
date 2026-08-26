class Solution {
    public String convertDateToBinary(String date) {
        String year=date.substring(0,4);
        String month=date.substring(5,7);
        String day=date.substring(8,10);

        year=Integer.toBinaryString(Integer.parseInt(year));
        month=Integer.toBinaryString(Integer.parseInt(month));
        day=Integer.toBinaryString(Integer.parseInt(day));

        return year+"-"+month+"-"+day;

    }
}
