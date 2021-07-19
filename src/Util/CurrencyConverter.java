package Util;

public class CurrencyConverter {

    public static double dollerPrice;
    public static double dollarBuy;
    public static final double IOF = 0.06;

    public static double currencyPrice() {
        return   ((dollarBuy*IOF)+dollarBuy)*dollerPrice;
    }

    @Override
    public String toString() {
        return "Amount to be paid in real: "+String.format("%.2f",currencyPrice());
    }

}
