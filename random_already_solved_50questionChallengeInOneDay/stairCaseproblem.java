public class stairCaseproblem {

    public static int find(int num) {
        if (num == 1 || num == 2) {
            return num;
        }
        return find(num-1) + find(num-2);
    }
    public static void main(String[] args) {
        System.out.println("No of ways: "+find(5));
    }
}
