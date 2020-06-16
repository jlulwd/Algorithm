package medium;

import javax.swing.*;
import java.net.StandardSocketOptions;
import java.util.Arrays;

/**
 * @Author someone
 * @Classname FindBestValue
 * @Description This Class is for excise
 * @Date 2020/6/14 下午12:29
 * @Created by someone
 * @Version 1.0
 */
public class FindBestValue {

    public static int findBestValue(int[] arr, int target) {
        //先排序
        Arrays.sort(arr);
        int n = arr.length;
        //预先加
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i-1] + arr[i - 1];
        }
        int l = 0, r = arr[n - 1], ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            //第一次二分查找
            int index = Arrays.binarySearch(arr, mid);
            if (index < 0) {
                index = -index - 1;
            }
            //第二次二分查找
            int cur = prefix[index] + (n - index) * mid;
            if (cur <= target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        int chooseSmall = check(arr, ans);
        int chooseBig = check(arr, ans + 1);
        return Math.abs(chooseSmall - target) <= Math.abs(chooseBig - target) ? ans : ans + 1;
    }
    private static int check(int[] arr, int ans) {
        int ret = 0;
        for (int num : arr) {
            ret += Math.min(num, ans);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(findBestValue(new int[]{1,2,23,24,34,36},
        110));
    }

    public int findBestValue2(int[] arr, int target) {
        int result = -1;
        //原数组的总和
        int sum = 0;
        //原数组的最大整数
        int maxInt = -1;
        int len = arr.length;
        //计算平均值
        float temp = (float)target/len;
        int avg = Math.round(temp);

        for(int i=0,ii=len; i<ii; i++){
            sum += arr[i];
            if(arr[i] > maxInt){
                maxInt = arr[i];
            }
        }
        if(sum - target == 0){
            result = maxInt;
        }else{
            result = getResult(arr, 0, avg, target);
        }
        return result;
    }

    public int getResult(int[] arr, int lastSum, int avg, int target){
        int sum = 0;
        for(int i=0,ii=arr.length;i<ii;i++){
            if(arr[i] < avg){
                sum += arr[i];
            }else{
                sum += avg;
            }
        }
        //当前计算的平均值
        int intValue = Math.abs(sum - target);
        //上一次计算的平均值
        int lastIntValue = Math.abs(lastSum - target);
        if(lastIntValue > intValue){
            avg ++;
            avg = getResult(arr, sum, avg, target);
        }else {
            if(lastSum != 0){
                avg --;
            }
        }
        return avg;
    }
}
