package easy;

/**
 * @author someone
 * @Classname ReverseInteger
 * @Description This Class is for
 * @Date 2020/5/27 15:21
 * @Created by someone
 * @Version 1.0
 */
public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(120));
    }
}
