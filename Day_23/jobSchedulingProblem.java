import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jobSchedulingProblem{

    char id;
    int deadline;
    int profit;

    public jobSchedulingProblem(char id, int deadline, int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    public void printJobScheduling(ArrayList<jobSchedulingProblem> arr, int t){
        int n=arr.size();
        Collections.sort(arr, (a,b)->b.profit-a.profit);//lamda expression
        boolean result[]=new boolean[t];
        char job[]=new char[t];
        for(int i=0;i<n;i++){
            for(int j=Math.min(t-1, arr.get(i).deadline-1);j>=0;j--){
                if(result[j]==false){
                    result[j]=true;
                    job[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(char jb:job){
            System.out.print(jb+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<jobSchedulingProblem> arr=new ArrayList<jobSchedulingProblem>();
        arr.add(new jobSchedulingProblem('1', 5, 55));
        arr.add(new jobSchedulingProblem('2', 2, 65 ));
        arr.add(new jobSchedulingProblem('3', 7, 75));
        arr.add(new jobSchedulingProblem('4', 3, 60));
        arr.add(new jobSchedulingProblem('5', 2, 70));
        arr.add(new jobSchedulingProblem('6', 1, 50));
        arr.add(new jobSchedulingProblem('7', 4, 85));
        arr.add(new jobSchedulingProblem('8', 5, 68));
        arr.add(new jobSchedulingProblem('9', 3, 45));
        System.out.println("Tum hamara sequence hoga yeah");
        jobSchedulingProblem job=new jobSchedulingProblem('a', 0, 0);
        job.printJobScheduling(arr, 7);
    }
}