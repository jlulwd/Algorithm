package easy;

/**
 * @Author someone
 * @Classname PlusOne
 * @Description This Class is for excise
 * @Date 2020/6/1 下午3:02
 * @Created by someone
 * @Version 1.0
 */
public class PlusOne {
    public static int [] plusOne(int [] digits) {
        int p = digits.length-1;
        if(digits[p]<9) {
            digits[p]=++digits[p];
        } else {
            do {
                digits[p--] = 0;
            } while (p >= 0 && digits[p] == 9);
            if (digits[0] != 0) {
                ++digits[p];
            } else {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] nums={0,9,9};
        int[] newNums=plusOne(nums);
        for (int i:newNums) {
            System.out.println(i);
        }
    }
}
