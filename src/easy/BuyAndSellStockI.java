package easy;

/**
 * @Author someone
 * @Classname BuyAndSellStock
 * @Description This Class is for excise
 * @Date 2020/6/8 下午5:54
 * @Created by someone
 * @Version 1.0
 */
public class BuyAndSellStockI {

    public static int maxProfit(int[] prices)  {
        int max=0, minPrice=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPrice) {
                minPrice = prices[i];
            }
            int delta = prices[i] - minPrice;
            if (delta>max)  {
                max = delta;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
