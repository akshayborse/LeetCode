package others;

public class FloodFill733 {
    public static void main(String[] args) {
        FloodFill733 obj = new FloodFill733();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] filledArray = obj.floodFill(image, sr, sc, newColor);
        for(int[] row:filledArray) {
            for(int val:row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        if(sr < row && sc < col) {
            int pixel = image[sr][sc];
            if(pixel != newColor)
                image = _floodFill(image, sr, sc, newColor, row, col, pixel);
        }
        return image;
    }

    public int[][] _floodFill(int[][] image, int sr, int sc, int newColor, int row, int col, int pixel) {
        if(sr < row && sc < col && sr >= 0 && sc >= 0 && image[sr][sc]==pixel) {
            image[sr][sc] = newColor;
            image = _floodFill(image, sr+1, sc, newColor, row, col, pixel);
            image = _floodFill(image, sr, sc+1, newColor, row, col, pixel);
            image = _floodFill(image, sr-1, sc, newColor, row, col, pixel);
            image = _floodFill(image, sr, sc-1, newColor, row, col, pixel);
        }
        return image;
    }
}