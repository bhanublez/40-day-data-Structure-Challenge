public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {0,5,6};
        int m = 3;
        int n = 3;
        mergee(nums1, m, nums2, n);
        for(int i: nums1){
            System.out.print(i + " ");
        }
    }

    //Approach 1
    public static void merge(int[] nums1,int m, int[] nums2,int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    //Approach 2
    public static void mergee(int[] num1, int m, int[] num2, int n) {
        int num=n+m;
        int i1=n-1,i2=m-1;
        if(m==0){
            System.out.println("Hello");
            num1[0]=num2[0];
        }
        //System.out.println(num2[0]);
        for(int i=num-1;i>=0;i--){
            if(i2==-1 ){
                num1[i]=num1[i1--];
            }else if(i1==-1 ){
                num1[i]=num2[i2--];
            }else{

                if(num1[i1]>num2[i2]){
                    num1[i]=num1[i1--];
                }else{
                    num1[i]=num2[i2--];
                }
                
            }     
        }
    
    }
}
