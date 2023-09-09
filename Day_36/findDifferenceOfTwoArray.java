import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findDifferenceOfTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int value:nums1){
            map.put(value,1);
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int value:nums2){
            if(map.containsKey(value)){
                map.put(value,-1);
            }else{
                if (!list2.contains(value)) {
                    list2.add(value);
                }
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                list1.add(key);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5,6,7,8,9};
        int[] nums2={1,2,3,4,5,6,7,8,9,10};
        findDifferenceOfTwoArray f=new findDifferenceOfTwoArray();
        List<List<Integer>> list=f.findDifference(nums1,nums2);
        System.out.println(list);
    }
}
