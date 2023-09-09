public class rangeAddtion {
    public int maxCount(int m, int n, int[][] ops) {
        int leftmin=m,rightmin=n;
        for(int[]op:ops){
            leftmin=Math.min(op[0],leftmin);
            rightmin=Math.min(rightmin,op[1]);
        }
        return leftmin*rightmin;
    }
    public static void main(String[] args) {
        int[][] ops={{2,2},{3,3}};
        rangeAddtion r=new rangeAddtion();
        System.out.println(r.maxCount(3,3,ops));
    }
}
