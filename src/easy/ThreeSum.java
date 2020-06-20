package easy;

/**
 * @Author someone
 * @Classname ThreeSum
 * @Description This Class is for excise
 * @Date 2020/6/12 上午11:08
 * @Created by someone
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> nlist = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] < -nums[i]) {
                    j++;
                } else if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    nlist.add(list);
                    j++;
                    k--;
                    //去掉重复比较
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    //去掉重复比较
                    while (j < k && k != nums.length - 1 && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return nlist;
    }

    public static void main(String[] args) {
        int [] arr = {5,2,-3,-1,-2,4,3,1};
        System.out.println(Arrays.asList(threeSum(arr)));
    }
}