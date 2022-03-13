package Hackerrank;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(int[][] arr) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; ++i) {
            for (int j = 0; j <= 3; ++j) {
                max = Math.max(max, (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]));
            }
        }
        return max;

    }

}

public class hourglassum {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        int[][] matrix3 = { { 3, 2, 1, 7,0,0 },
                { 9, 11, 5, 4,0,0  },
                { 6, 0, 13, 17 ,0,0 },
                { 7, 22, 14, 15 ,0,0 },
                { 7, 23, 14, 15 ,0,0 } ,
                { 7, 24, 14, 15 ,0,0 } };

        int result = Result.hourglassSum(matrix3);
        System.out.println(result);
    }
}