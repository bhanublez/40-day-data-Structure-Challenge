public class balanceBracket {
    public static int swapCount(int arr[]){
        int n=arr.length;
        int countL=0,countR=0,swap=0,imbalance=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='['){
                countL++;
                if(imbalance>0){
                    swap+=imbalance;
                    imbalance--;
                }
            }else if(arr[i]==']'){
                countR++;
                imbalance=countR-countL;
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        String str = "[]][][";
        int n = str.length();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=str.charAt(i);
        }
        System.out.println(swapCount(arr));
    }
}

