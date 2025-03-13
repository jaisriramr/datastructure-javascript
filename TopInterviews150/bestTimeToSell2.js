/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock. 
    You can only hold at most one share of the stock at any time. 
    However, you can buy it then immediately sell it on the same day.

    Find and return the maximum profit you can achieve.

 * @param {*} prices 
 * @returns 
 */
var bestTimeToSell2 = function (prices) {
  // In this Problem Best time to sell consider creating a group of i + 1 and i in a single array and if i + 1 > i add it to profit
  // [2, 1, 2, 1, 0, 0, 1]
  // [[2,1], [1,2], [2,1], [1,0], [0,0], [0,1]]

  let maxProfit = 0;

  for (let i = 0; i < prices.length; i++) {
    if (i + 1 < prices.length && prices[i + 1] > prices[i]) {
      maxProfit += prices[i + 1] - prices[i];
    }
  }
  return maxProfit;
};

console.log(bestTimeToSell2([2, 1, 2, 1, 0, 0, 1]));
