package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname climbStairs
 * @Description This Class is for excise
 * @Date 2020/6/2 上午11:26
 * @Created by someone
 * @Version 1.0
 */
public class climbStairs {
    public static int climbStairs1(int n)   {
        //a这里是斐波那契数列导数第二项的值
        int a=1, counts =1;
        while(--n>0)    {
            counts += a;
            a=counts-a;
        }
        return counts;
    }

    public static int climbStairs2(int n) {
        if(n==1) {
            return 1;
        }
        if(n==2)    {
            return 2;
        }
        return climbStairs2(n-2)+climbStairs2(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(climbStairs1(num));
        
    }
}
