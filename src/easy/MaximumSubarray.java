package easy;

import java.util.Random;

/**
 * @Author someone
 * @Classname MaximumSubarray
 * @Description This Class is for excise
 * @Date 2020/5/31 上午11:58
 * @Created by someone
 * @Version 1.0
 */
public class MaximumSubarray {
    public static int maxSubArray1(int[] nums)  {
        int len=nums.length, dp=nums[0],max=dp;
        for(int i=1;i<len;i++)  {
            dp=nums[i]+(dp>0?dp:0);
            if(dp>max)  {
                max=dp;
            }
        }
        return max;
    }
    
    public static int maxSubArray2(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private static int helper(int[] nums, int left, int right) {
        if(left>=right) {
            return nums[left];
        }
        int mid=(left+right)>>1;
        int leftAnswer=helper(nums,left,mid);
        int rightAnswer=helper(nums,mid+1,right);
        //leftMax和rightMax是暂时给的
        int leftMax=nums[mid], rightMax=nums[mid+1];
        int temp=0;
        for(int i=mid;i>=left;--i){
            temp += nums[i];
            if (temp > leftMax) {
                leftMax = temp;
            }
        }
        temp=0;
        for(int i=mid+1;i<right;++i) {
            temp += nums[i];
            if (temp > rightMax) {
                rightMax = temp;
            }
        }
        return Math.max(Math.max(leftAnswer, rightAnswer), leftMax+rightMax);
    }

    public static void main(String[] args) {
        int init=-5;
        int n=10;
        int[] nums=new int[n];
        Random rand=new Random();
        for (int i = 0; i < n; i++) {
            nums[i]=rand.nextInt(100);
        }
        //获取开始时间
        long startTime = System.nanoTime();
        //测试的代码段
        System.out.println(maxSubArray2(nums));
        //获取结束时间
        long endTime = System.nanoTime();
        //输出程序运行时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");
    }
}
