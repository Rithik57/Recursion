import java.util.*;

public class solution{
    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        image = floodFill(image,1,1,2);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        done = new boolean[image.length][image[0].length];
        fill(image,sr,sc,newColor);
        return image;
    }
    static boolean[][] done;
    public static void fill(int[][] image,int i,int j,int val){
        int temp = image[i][j];
        image[i][j] = val;
        done[i][j] = true;
        if(i!=0 && image[i-1][j]==temp && !done[i-1][j])fill(image,i-1,j,val); // for top pixel
        if(j!=image[0].length-1 && image[i][j+1]==temp && !done[i][j+1])fill(image,i,j+1,val); // for right pixel;
        if(i!=image.length-1 && image[i+1][j]==temp && !done[i+1][j])fill(image,i+1,j,val); // for bottom pixel;
        if(j!=0 && image[i][j-1]==temp && !done[i][j-1])fill(image,i,j-1,val); // for left pixel;
    }
}
