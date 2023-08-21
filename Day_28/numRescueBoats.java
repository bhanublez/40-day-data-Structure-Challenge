import java.util.Arrays;
//https://leetcode.com/problems/boats-to-save-people/description/
public class numRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int light=0;
        int heavy=people.length-1;
        Arrays.sort(people);
        while(light<=heavy){
            if(people[light]+people[heavy]<=limit){
                heavy--;
                light++;
            }else{
                heavy--;
            }
            count++;
        }
        return count;
    }
    
}
