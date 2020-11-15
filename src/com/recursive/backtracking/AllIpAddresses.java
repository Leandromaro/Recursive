package com.recursive.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllIpAddresses {

    public static void main(String[] args) {
        String s = "192168099";
        List<String> solution = solution(s);
        solution.stream().forEach(System.out::println);
    }

    public static List<String> solution(String S) {
        List<String> allIpAddresses = new ArrayList<>();
        int[] path = new int[4];
        snapshotIp(allIpAddresses, S, 0, path, 0);
        return allIpAddresses;
    }

    private static void snapshotIp(List<String> allIpAddresses, String s, int builderIndex, int[] path, int segment) {
        if (segment==4 && builderIndex == s.length()){
            allIpAddresses.add(path[0]+ "." + path[1] + "." + path[2]+ "." + path[3]);
            return;
        }else if ((segment==4 || builderIndex == s.length())){
            return;
        }
        for (int len = 1; len <=3 && builderIndex + len <= s.length(); len++){
            String snapshot = s.substring(builderIndex, builderIndex+len);
            int value = Integer.parseInt(snapshot);
            if (value>255 || len>=2 && s.charAt(builderIndex)=='0'){
                break;
            }
            path[segment] = value;
            snapshotIp(allIpAddresses,s,builderIndex + len, path, segment+1);
            path[segment] = -1;
        }
    }
}
