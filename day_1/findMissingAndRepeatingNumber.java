package day_1;

public class findMissingAndRepeatingNumber {
       public static int[] findMissingAndRepeatingNumber(int num[]){
            int n=num.length;
            int sum1=(n)*(n+1)/2;
            int sum2=(n)*(n+1)*(2*n+1)/6;
            int rsum1=0;
            int rsum2=0;
            for(int i=0;i<n;i++){
                rsum1+=num[i];
                rsum2+=(long)Math.pow(num[i],2);
            }
            long val1=(rsum1-sum1);
            long val2=0;
            try{
             val2=(rsum2-sum2)/val1;
            }catch(Exception e){
                System.out.println(e);
            }
            int arr[]=new int[2];
            arr[0]=(int) ((val1+val2)/2);
            arr[1]=(int) ((val2-val1)/2);
            return arr;
        }
    
    public static void main(String[] args) {
        int arr[]={1,1,3,4,8,6,7,5};
        int result[]=findMissingAndRepeatingNumber(arr);
        System.out.println("Missing number is:"+result[1]+" Dublicate number is: "+result[0] );

    }
}
