package easy;

/**
 * @Classname TwoSums1
 * @Description This Class is for
 * @Date 2020/5/26 17:50
 * @Created by LWD
 * @Version 1.0
 */
public class TwoSums1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = nums[i];
                    indices[1] = nums[j];
                    return indices;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();    //获取开始时间
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        twoSum(array, 15);    //测试的代码段
        long endTime = System.nanoTime();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
    }
}
