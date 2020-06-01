package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname LongestCommonPrefix
 * @Description This Class is for excise
 * @Date 2020/5/29 上午7:35
 * @Created by someone
 * @Version 1.0
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        for (int i = 0; i < minLen; i++) {
            for (int j = 0; j < len; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String [] strs=line.split(" ");
        System.out.println(longestCommonPrefix(strs));
    }
}
