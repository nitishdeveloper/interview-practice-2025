package DSA;

public class MaxStock {
    public static void main(String[] args) {
        System.out.println("result :: "+solution(new int[]{7,1,5,3,6,4}));
    }
    private static int solution(int[] prices){
        int maxProfit = 0;
        int minStock = prices[0];

        for (int price : prices) {
            minStock = Math.min(minStock, price);
            maxProfit = Math.max(maxProfit, price - minStock);
        }

        return maxProfit;
    }
}
