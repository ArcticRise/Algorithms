package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.
 */


public class SimplifyPath {
    public static void main(String[] args){
        String path = "/../"; // Expected / as ans
        System.out.println(Solution.simplifyPath(path));

        String path2 = "/home//foo/"; // Expected /home/foo as ans
        System.out.println(Solution.simplifyPath(path2));
    }
}


class Solution {
    public static String simplifyPath(String path) {
        List<String> arr = new ArrayList<>();
        String[] split_arr = path.split("/");
        for(String s: split_arr){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            if(!s.equals("..")){
                arr.add(s);
            }else{
                if(arr.size() != 0){
                    arr.remove(arr.size()-1);
                }
            }
        }
        return "/"+String.join("/",arr);
    }
}
