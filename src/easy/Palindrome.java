package easy;

/**
 * @author someone
 * @Classname Palindrome
 * @Description This Class is for
 * @Date 2020/5/27 15:36
 * @Created by LWD
 * @Version 1.0
 */
public class Palindrome {
    public static boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        int copyX = x, reverse = 0;
        while (copyX > 0) {
            reverse = reverse * 10 + copyX % 10;
            copyX /= 10;
        }
        return x == reverse;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }
        int halfReverseX = 0;
        while (x > halfReverseX) {
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }
        return halfReverseX == x || halfReverseX/10==x;
    }

    public static void main(String[] args) {
        //获取开始时间
        long startTime = System.nanoTime();
        //测试的代码段
        System.out.println(isPalindrome1(521));
        //获取结束时间
        long endTime = System.nanoTime();
        //输出程序运行时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");

    }
}
