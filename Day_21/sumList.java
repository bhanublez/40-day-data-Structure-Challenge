// Sum Lists: You have two numbers represented by a linked list, where each node contains a single 
// digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a 
// function that adds the two numbers and returns the sum as a linked list. 
// EXAMPLE 
// Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295. 
// Output: 2 -> 1 -> 9. That is, 912. 

import java.util.LinkedList;

public class sumList {

    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        list1.add(7);
        list1.add(1);
        list1.add(6);
        list2.add(5);
        list2.add(9);
        list2.add(2);
        System.out.println(sumList(list1,list2));
    }
    private static LinkedList<Integer> sumList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result=new LinkedList<>();
        int carry=0;
        int sum=0;
        int i=0;
        while(i<list1.size() && i<list2.size()){
            sum=list1.get(i)+list2.get(i)+carry;
            result.add(sum%10);
            carry=sum/10;
            i++;
        }
        while(i<list1.size()){
            sum=list1.get(i)+carry;
            result.add(sum%10);
            carry=sum/10;
            i++;
        }
        while(i<list2.size()){
            sum=list2.get(i)+carry;
            result.add(sum%10);
            carry=sum/10;
            i++;
        }
        if(carry!=0){
            result.add(carry);
        }
        return result;
    }
   
}
