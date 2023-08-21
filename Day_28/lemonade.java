public class lemonade {
    public static boolean lemonadeChange(int[] bills) {
        int count5=0,count10=0;
        for(int i : bills){
            if(i==5){
                count5++;
            }else if(i==10){
                count10++;
                count5--;
                if(count5<0){
                    return false;
                }
            }else{
                if(count10-1>=0 && count5-1>=0){
                    count10--;
                    count5--;
                }else if(count5-3>=0){
                    count5-=3;
                }else{
                    return false;
                }
            }
        }
            return true;
    }

    public static void main(String[] args) {
        int arr[]={5,5,5,10,20};
        System.out.println("Can change "+lemonadeChange(arr));
    }
    
}
