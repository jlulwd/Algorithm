package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname AddBinary
 * @Description This Class is for excise
 * @Date 2020/6/2 上午8:53
 * @Created by someone
 * @Version 1.0
 */
public class AddBinary {
    public static String addBinary(String a, String b)  {
        StringBuilder sb=new StringBuilder();
        int carry=0, p1=a.length()-1, p2=b.length()-1;
        while(p1>=0&&p2>=0) {
            carry+=a.charAt(p1--)-'0';
            carry+=b.charAt(p2--)-'0';
            sb.insert(0,(char)(carry%2+'0'));
            carry>>=1;
        }
        while(p1>=0)    {
            carry+=a.charAt(p1--)-'0';
            sb.insert(0, (char)(carry%2+'0'));
            carry>>=1;
        }
        while(p2>=0)    {
            carry+=b.charAt(p2--)-'0';
            sb.insert(0,(char)(carry%2+'0'));
            carry>>=1;
        }
        if(carry==1)    {
            sb.insert(0,'1');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        System.out.println(addBinary(line1,line2));
    }
}





