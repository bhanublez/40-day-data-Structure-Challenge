public class gasStation {
    public static int minStation(int A[],int B[]){
        //Array A represent gas Station fuel availability
        //Array B represent cost from moving from one station another
        int n=A.length;//Both array A and B have equal length
        int start=0,fuel=0,distance=0;
        for(int i=0;i<n;i++){
            fuel+=A[i];
            distance+=B[i];
            if(fuel<0){
                fuel=0;
                start=i+1;
            }
        }
        if(distance>=0){
            return start%n;//Taking remainder only
        }
        return -1;//Not possible for traversing whole city 
    }
}
