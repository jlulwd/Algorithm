package easy;

/**
 * @Author someone
 * @Classname RemoveElement
 * @Description This Class is for excise
 * @Date 2020/5/30 下午2:27
 * @Created by someone
 * @Version 1.0
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int tail = 0;
        for (int i = 0; i < nums.length; i++) {
            //这里i和tail相当于两个指针
            if (nums[i] != val) {
                nums[tail++] = nums[i];
            }
        }
        return tail;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5, 5, 6};
        System.out.println(removeElement(nums, 3));
    }
}
