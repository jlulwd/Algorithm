package easy;

/**
 * @Author someone
 * @Classname merrgeArray
 * @Description This Class is for excise
 * @Date 2020/6/2 下午12:51
 * @Created by someone
 * @Version 1.0
 */
public class mergeArray {
    public static void merge(int[]nums1, int m,int[] nums2,int n)    {
        int p=m--+n---1;
        while(m>=0&&n>=0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while(n>=0) {
            nums1[p--] = nums2[n--];
        }
    }
    public static void main(String[] args) {
        int [] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};
        int m=3, n=3;
        merge(nums1, m, nums2, n);
        printArray(nums1);
    }
    public static void printArray(int [] nums)    {
        for (int i:nums) {
            System.out.println(i);
        }
    }
}
