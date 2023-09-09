import java.util.HashMap;
import java.util.Map;

public class topKElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int[] arr=new int[k];
        int i=0;
        while(i<k){
            int max=0;
            int maxKey=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    maxKey=entry.getKey();
                }
            }
            arr[i]=maxKey;
            map.remove(maxKey);
            i++;
        }
        return arr;
    }
}
