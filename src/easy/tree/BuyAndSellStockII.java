package easy.tree;

/**
 * @Author someone
 * @Classname BuyAndSellStockII
 * @Description This Class is for excise
 * @Date 2020/6/8 下午6:14
 * @Created by someone
 * @Version 1.0
 */
public class BuyAndSellStockII {

    public static int maxProfit(int[] prices)   {
        int max=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >prices[i-1]) {
                max+=prices[i]-prices[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums= {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
