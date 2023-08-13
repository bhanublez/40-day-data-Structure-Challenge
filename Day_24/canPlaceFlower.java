public class canPlaceFlower {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
    
    
            for(int i=0;i<flowerbed.length && n>0;i++){
                if(flowerbed[i]==0){
                    if(i==0 && (flowerbed.length==1 || flowerbed[i+1]==0)){
                        n--; flowerbed[i]=1;
                    }
                    else if(i==flowerbed.length-1 && flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        n--;
     }else if(i+1<flowerbed.length && flowerbed[i+1]==0 && i-1>=0 && flowerbed[i-1]==0){
                       flowerbed[i]=1;
                         n--;
                     }
                 }
            }
         return n == 0;
      
        }
    public static void main(String[] args) {
        int[] nums={1,0,0,0,1};
        int n=1;
        canPlaceFlower obj=new canPlaceFlower();
        System.out.println(obj.canPlaceFlowers(nums,n));
    }
}
