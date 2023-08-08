//https://www.geeksforgeeks.org/linked-list-in-zig-zag-fashion/

import java.util.LinkedList;

public class ZigZagLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(10);
        list.add(5);

        System.out.println("Original List: " + list);
        zigZag(list);
        System.out.println();
        System.out.println("ZigZag List: " + list);
        
        
    }

    private static void zigZag(LinkedList list) {
        boolean flag = true;
        for(int i=0; i<list.size()-1; i++){
            if(flag){
                if((int)list.get(i) > (int)list.get(i+1)){
                    int temp = (int)list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }else{
                if((int)list.get(i) < (int)list.get(i+1)){
                    int temp = (int)list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }
            }
            flag = !flag;
        }
    }
}