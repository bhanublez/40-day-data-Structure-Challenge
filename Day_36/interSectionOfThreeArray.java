import java.util.*;
public class interSectionOfThreeArray {
    
    public static List<Integer> arraysIntersection(int[] a,int []b,int []c){
        int l1=a.length,l2=b.length,l3=c.length;
        int index1=0,index2=0,index3=0;
        List<Integer> result=new ArrayList<>();
        while(index1<l1 && index2<l2 && index3<l3){
            if(a[index1]==b[index2] && b[index2]==c[index3]){
                result.add(a[index1]);
                index1++;
                index2++;
                index3++;
            }else{
                int in1=0,in2=0,in3=0;
                if(a[index1]<b[index2] || a[index1]<c[index3]){
                    in1=1;
                }
                if(b[index2]<a[index1] || b[index2]<c[index3]){
                    in2=1;
                }
                if(c[index3]<a[index1] || c[index3]<b[index2]){
                    in3=1;
                }
                index1+=in1;
                index2+=in2;
                index3+=in3;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        
        int [] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9},
        arr3 = {1,3,4,5,8};
        
        System.out.println(arraysIntersection(arr1, arr2, arr3));

        
    }
}
