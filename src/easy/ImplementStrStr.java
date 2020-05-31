package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname ImplementStrStr
 * @Description This Class is for excise
 * @Date 2020/5/31 8:04
 * @Created by someone
 * @Version 1.0
 */
public class ImplementStrStr {
    public static int strStr(String haystack, String needle)  {
       int l1=haystack.length(), l2=needle.length();
       if(l1<l2) {
           return -1;
       }
        for (int i = 0; ; i++) {
            if (i+l2>l1) {
                return -1;
            }
            for (int j = 0; ;j++) {
                if(j==l2) {
                    return i;
                }
                if(haystack.charAt(i+j)!=needle.charAt(j))  {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        System.out.println(strStr(line1, line2));


    }
}
