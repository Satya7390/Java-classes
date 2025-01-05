public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = { 7,6,4,3,1 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int prices[]) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
