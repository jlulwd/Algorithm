package easy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author someone
 * @Classname TwoSums1
 * @Description This Class is for
 * @Date 2020/5/26 17:50
 * @Created by someone
 * @Version 1.0
 */
public class TwoSums {
    public static int[] twoSum1(int[] nums, int target) {
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

    public static int[] twoSum2(int[] nums, int target) {
        int len=nums.length;
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for (int i = 0; i < len ; i++) {
            final Integer value = map.get(nums[i]);
            if(value!=null) {
                return new int[]{value, i};
            }
            map.put(target-nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        //获取开始时间
        long startTime = System.nanoTime();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //测试的代码段
        int [] indexArr=twoSum1(array, line);
        System.out.println("第一个数是:"+indexArr[0]);
        System.out.println("第二个数是:"+indexArr[1]);
        //获取结束时间
        long endTime = System.nanoTime();
        //输出程序运行时间   
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");
    }
}
