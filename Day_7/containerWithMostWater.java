public class containerWithMostWater{

    //My Intial Brute force approach
    // public static int maxArea(int[] arr) {
    //     int h1=arr[0],h2=arr[arr.length-1];
    //     int area=-1;
    //     for(int i=0,j=arr.length-1;i<=j;){
    //         int a=Math.min(h1,h2);
    //         int b=j-i;
    //         area=Math.max(area,a*b);
    //         if(h1<h2 && i+1<=j){
    //             i++;
    //             h1=arr[i];
    //         }else if(h1>h2 && i<=j-1){
    //             j--;
    //             h2=arr[j];
    //         }else if(h1==h2  && i+1<=j){
    //             if(arr[i+1]>arr[j-1]){
    //                 h1=arr[++i];
    //             }else{
    //                 h2=arr[--j];
    //             } 
    //         }else{
    //             break;
    //         }
    //     }
    //     return area;
    // }

    //But with little Modification
    public static int maxArea(int[] arr) {
        int n=arr.length,h1=arr[0],h2=arr[n-1],area=-1,i=0,j=n-1;        
        while(i<=j){
            area=Math.max(area,(Math.min(h1,h2))*(j-i));
            if(h1<h2 && i+1<=j){
                h1=arr[++i];
            }else if( i<=j-1){
                h2=arr[--j];
            }else{
                break;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] arr={7,7,1,1,1,1};
        System.out.println(maxArea(arr));
    }
}