package LeetCode;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupnagrams(arr));
    }

    public static List<List<String>> groupnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String s2 = new String(c);
            if(!map.containsKey(s2)){
                map.put(s2,new ArrayList<String>());
            }
            map.get(s2).add(s);
        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
