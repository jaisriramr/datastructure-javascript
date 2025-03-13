
class BestTimeToSell {

    public int bestTimeToSell(int[] prices) {
        int minPrices = Integer.MAX_VALUE; // set max value
        int maxPrices = 0; // max price
        for (int price : prices) {
            if (price < minPrices) { // check if the current price is less than the previous min price if its it change the minprice to current price
                minPrices = price;
            } else if (price - minPrices > maxPrices) { // check if the profit (sell - buy) is greater the current maxprice if it is change maxPrice to current profit
                maxPrices = price - minPrices;
            }
        }
        return maxPrices;
    }

}
