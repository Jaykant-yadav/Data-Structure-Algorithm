
public class MostWaterContainer {
    //Brute Force - O(n2) 
    public static int mostWater(int height[]){
        int maxWater = 0;
        for(int i=0; i<height.length; i++) {
            for(int j=i+1; j<height.length; j++) {
                int width = j - i;
                int ht= Math.min(height[i], height[j]);
                int area = width * ht;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }

    //Two Pointer - O(n)
    public static int mostWater2(int height[]){
        
    }
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(mostWater(height));
    }
}
