/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Is_A;

/**
 *
 * @author buse
 */
public class DrugTakenByPrescription extends Product {
        public DrugTakenByPrescription(int PurchaseFee, String name) {
        super(PurchaseFee, name);
    }

    public String howToUse() {
        return "Take this drug according to the given prescription.";
    }
 public String toString() {
        return super.toString() + "\nHow To Use=" + howToUse() + "\n";
    }

}
