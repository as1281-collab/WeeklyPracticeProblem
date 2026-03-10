public class level1q4 {
    public static void main(String[] args) {
        int cost_price=129;
        int sell_price=191;
        int profit_amt=sell_price-cost_price;
        float profit_per=(profit_amt*100)/cost_price;
        System.out.println("The cost price is INR "+cost_price+" and the selling price is INR "+sell_price+"."+"\nThe profit is INR "+profit_amt+" and the profit percentage is "+profit_per+".");
    }
}