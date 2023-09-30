import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupThePeople{
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
            if(map.get(groupSizes[i]).size() == groupSizes[i]){
                res.add(map.get(groupSizes[i]));
                map.remove(groupSizes[i]);
            }
        }
        return res;
    }
}