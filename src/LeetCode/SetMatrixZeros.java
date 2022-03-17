package LeetCode;

import java.util.*;
public class SetMatrixZeros {

    public static void main(String [] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(Arrays.deepToString(matrix));
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
        Set<Integer> r = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (r.contains(i) || c.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
