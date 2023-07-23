//https://leetcode.com/problems/plus-one/
public class plusOne {
    public static void main(String[] args) {
        int arr[]={9,9,9};
        int ans[]=plusOne(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] plusOne(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }else{
                arr[i]=0;
            }
        }
        if(arr[0]==0){
            int ans[]=new int[n+1];
            ans[0]=1;
            return ans;
        }
        return arr;
    }
}
