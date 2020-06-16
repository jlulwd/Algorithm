package easy;

import java.util.Scanner;

/**
 * @Author someone
 * @Classname SearchInsertPosition
 * @Description This Class is for excise
 * @Date 2020/5/31 8:33
 * @Created by someone
 * @Version 1.0
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = (right + left) >> 1;
        while (left <= right) {
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (right + left) >> 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(searchInsert(arr, num));
    }
}
