/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Is_A;

/**
 *
 * @author buse
 */
public class OverTheCounter extends Product{
        public OverTheCounter(int PurchaseFee, String name) {
        super(PurchaseFee, name);
    }

    public String howToUse() {
        return "Take this drug any time you want";
    }

    public String toString() {
        return super.toString() + "\nHow To Use=" + howToUse() + "\n";
    }

      public int calculateFee() {
        
        double taxamount = 40;
        return (int) (PurchaseFee +(PurchaseFee*taxamount/100));
    }
}
