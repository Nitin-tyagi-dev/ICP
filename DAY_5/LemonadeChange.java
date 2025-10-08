package DAY_5;
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int len = bills.length;
        int five_counts = 0 ;
        int ten_counts = 0 ;
        for(int i = 0 ; i < len ; i++){
            if(bills[i] == 5) five_counts++;
            else if (bills[i] == 10){
                five_counts--;
                ten_counts++;
                if(five_counts < 0 ) return false ;
            }
            else{
                if( five_counts > 0 && ten_counts > 0 ){
                    five_counts--;
                    ten_counts--;
                }
                else{
                    five_counts -= 3 ;
                }
                if(five_counts < 0 || ten_counts < 0)  return false ;
            }
        }
        
        return true ;
    }
    public static void main(String[] args) {
        LemonadeChange obj = new LemonadeChange();
        int[] bills = {5,5,5,10,20};
        System.out.println(obj.lemonadeChange(bills)); // true

        int[] bills2 = {5,5,10,10,20};
        System.out.println(obj.lemonadeChange(bills2)); // false
    }
}
