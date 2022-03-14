package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 */

public class findMedianSortedArray {
    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(Solution.findMedianSortedArrays(nums1,nums2));

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};
        System.out.println(Solution.findMedianSortedArrays(nums3,nums4));

    }
}

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0, j = 0;
        while(true){
            if(i == nums1.length || j == nums2.length){
                break;
            }
            if(nums1[i] <= nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }
        if(i < nums1.length){
            while(i != nums1.length){
                arr.add(nums1[i]);
                i++;
            }
        }

        if(j < nums2.length){
            while(j != nums2.length){
                arr.add(nums2[j]);
                j++;
            }
        }
        Collections.sort(arr);

        int[] mergedArr = arr.stream().mapToInt(x -> x).toArray();

        if(mergedArr.length%2 != 0){
            return mergedArr[(mergedArr.length-1)/2];
        }else{
            return (double)(mergedArr[(mergedArr.length-1)/2] + mergedArr[mergedArr.length/2])/2;
        }
    }
}
