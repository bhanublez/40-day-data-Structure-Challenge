//https://leetcode.com/problems/can-place-flowers/

import java.util.Scanner;

public class canPlaceFlower {

    //Brute force approach 
    //Time complexity O(n)
    public static boolean canPlaceFlower(int[] flowerbed, int n) {


        for(int i=0;i<flowerbed.length && n>0;i++){
            if(flowerbed[i]==0){
                if(i==0 && (flowerbed.length==1 || flowerbed[i+1]==0)){
                    n--; flowerbed[i]=1;
                }
                else if(i==flowerbed.length-1 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    n--;
 }else if(i+1<flowerbed.length && flowerbed[i+1]==0 && i-1>=0 && flowerbed[i-1]==0){
                   flowerbed[i]=1;
                     n--;
                 }
             }
        }
     return n == 0;
  
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,0,0,1};
        //Scanner sc=new Scanner(System.in);
        int n=2;
        System.out.println("Can place flower "+canPlaceFlower(arr,n));
    }
}
