package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname CountAndSay
 * @Description This Class is for excise
 * @Date 2020/5/31 上午11:35
 * @Created by someone
 * @Version 1.0
 */
public class CountAndSay {

    public static String countAndSay(int n)    {
        String str="1";
        while(--n>0)    {
            int times=1;
            StringBuilder sb=new StringBuilder();
            char[] chars=str.toCharArray();
            int len=chars.length;
            for (int i = 1; i < len; i++) {
                if(chars[i-1]==chars[i])    {
                    times++;
                } else {
                    sb.append(times).append(chars[i-1]);
                    times=1;
                }
            }
            str=sb.append(times).append(chars[len-1]).toString();
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(countAndSay(num));
    }
}
