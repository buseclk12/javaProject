/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Is_A;

import Interface.Bill;
import java.util.ArrayList;

/**
 *
 * @author buse
 */
public abstract class Product implements Bill{
    protected int PurchaseFee;
    protected String name;

    protected static int numProducts;

    public Product(int PurchaseFee, String name) {
        this.PurchaseFee = PurchaseFee;
        this.name = name;

    }

    public double getSalesFee() {
        return PurchaseFee;
    }

    public String getName() {
        return name;
    }

    public void setSalesFee(int PurchaseFee) {
        this.PurchaseFee = PurchaseFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumProducts() {
        return numProducts;
    }

    public static void setNumProducts(int numProducts) {
        Product.numProducts = numProducts;
    }

    public int calculateFee() {
        return (int) (PurchaseFee * 0.09);
    }

    public abstract String howToUse();

    public String toString() {
        return "\nProduct Name=" + name + "\nFee=" + PurchaseFee + "\n";
    }
}
