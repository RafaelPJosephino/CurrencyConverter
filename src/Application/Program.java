package Application;

import Util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is the dollar price? ");
        CurrencyConverter.dollerPrice = scanner.nextDouble();
        System.out.println("");
        System.out.print("how many dollars will be bought? ");
        CurrencyConverter.dollarBuy = scanner.nextDouble();

        System.out.printf("Amount to be paid in real: %.2f ",CurrencyConverter.currencyPrice());

        scanner.close();
    }

}
