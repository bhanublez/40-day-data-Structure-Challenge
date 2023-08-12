public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        fill(image,sr,sc,image[sr][sc],color);
        
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int i, int color) {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=i){
            return;
        }
        image[sr][sc]=color;
        fill(image,sr+1,sc,i,color);
        fill(image,sr-1,sc,i,color);
        fill(image,sr,sc+1,i,color);
        fill(image,sr,sc-1,i,color);
    }

    public static void main(String[] args) {
        floodFill floodFill=new floodFill();
        int[][] image={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;
        floodFill.floodFill(image,sr,sc,color);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
   
}
