package StacksAndQueue.Questions;

public class HistogramMaxArea {

    public static void main(String[] args){
        int[] heights = new int[] {1};
        HistogramMaxArea histogram = new HistogramMaxArea();

        int largestArea = histogram.largestRectangleArea(heights);
        System.out.println(largestArea);
    }

    public int largestRectangleArea(int[] heights){

        int largestArea = 0;

        //including index i, counting max possible area;
        for (int i = 0; i < heights.length; i++) {
            int area = 0;
            //Counting till left;
            for (int j = i; j >= 0; j--) {
                if(heights[j]< heights[i]){
                    break;
                }
                area += heights[i];
            }
            //Counting till right;
            for (int j = i+1; j < heights.length; j++) {
                if (heights[j] < heights[i]) {
                    break;
                }
                area += heights[i];
            }
            //Updating max after each index;
            if (largestArea<area) {
                largestArea = area;
            }
        }

        return largestArea;
    }
}
