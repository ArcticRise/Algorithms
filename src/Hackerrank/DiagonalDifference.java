package Hackerrank;

import java.util.*;

public class DiagonalDifference {

    public static  void main(String[] args){
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(9,8,9));
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int  diag1=0, diag2 = 0;
        for(int i = 0; i < arr.size(); i++){
            diag1 += arr.get(i).get(i); // [0][0],[1][1]...
            diag2 += arr.get(arr.size()-1-i).get(i); //[2][0], [1][1], [0][2]...
        }
        return  Math.abs(diag1-diag2);

    }
}
