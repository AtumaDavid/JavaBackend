package arrays;

//import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args){
        int[][] marks = {
                {34,56,64,78,56},
                {102,565,786,654,876},
                {3,6,7,9,4}
        };
        for (int[] row : marks) {
            for (int mark : row){
                System.out.print(mark + "\t" );
            }
            System.out.println();//Move to the next line after each row
        }
    }
}
