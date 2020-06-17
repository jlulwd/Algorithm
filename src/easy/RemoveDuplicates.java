package easy;

/**
 * @Author someone
 * @Classname RemoveDup
 * @Description This Class is for excise
 * @Date 2020/5/30 下午1:38
 * @Created by someone
 * @Version 1.0
 */
public class RemoveDuplicates {
    public static int removeDeplicates(int [] nums) {
        int len=nums.length;
        if(len<=1) {
            return len;
        }
        int tail=1;
        for (int i = 1; i < len; ++i) {
            if(nums[i-1]!=nums[i])  {
                nums[tail++]=nums[i];
            }
        }
        return tail;
    }

    public static void main(String[] args) {
        int [] arr={1,1,2,5,8,8,8,9,9,9};
        System.out.println(removeDeplicatesII(arr,1));
    }

    public static int removeDeplicatesII(int [] nums, int k) {
        int i = 0;
        for(int n:nums){
            if(i<k||n>nums[i-k]) {
                nums[i++]=n;
            }
        }
        return i;
    }
}
