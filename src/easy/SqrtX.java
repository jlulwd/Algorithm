package easy;

/**
 * @Author someone
 * @Classname SqrtX
 * @Description This Class is for excise
 * @Date 2020/6/2 上午10:56
 * @Created by someone
 * @Version 1.0
 */
public class SqrtX {
    public static int mySqrt(int x) {
        long n = x;
        while(n*n>x)    {
            n=(n+x/n)>>1;
        }
        return (int)n;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
