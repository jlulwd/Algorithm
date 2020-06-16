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
    public static int climbStairs1(int n) {
        //a这里是斐波那契数列导数第二项的值
        int a = 1, counts = 1;
        while (--n > 0) {
            counts += a;
            a = counts - a;
        }
        return counts;
    }

    public static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs2(n - 2) + climbStairs2(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(climbStairs3(num));

    }

    public static int climbStairs3(int n) {
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = pow(q, n);
        return res[0][0];
    }

    public static int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }
}
