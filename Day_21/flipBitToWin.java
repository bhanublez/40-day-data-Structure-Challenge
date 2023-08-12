public class flipBitToWin {
    public int minBitFlips(int start, int goal) {
        int combine=start^goal;
        int count=0;
        while(combine>0){
            count++;
            combine=combine & (combine -1);
        }
        return count;
    }
    public static void main(String[] args) {
        flipBitToWin flipBitToWin=new flipBitToWin();
        System.out.println(flipBitToWin.minBitFlips(2,6));
    }
}
