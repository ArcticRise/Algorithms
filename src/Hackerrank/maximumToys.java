package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maximumToys {
    public static void main(String[] args){
        // Given an array find and budget k find the max amount of items you can buy
        // [1,2,3,4], k = 7 should return 3 as max
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(3);
        arr.add(4);
        arr.add(7);
        System.out.println(maximumToy(arr,7));
    }
    public static int maximumToy(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int runningTot = 0;
        int i = 0;
        while(runningTot < k){
            runningTot += prices.get(i);
            i++;
        }
        return i-1;
    }

}
