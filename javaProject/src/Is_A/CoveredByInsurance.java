/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Is_A;

/**
 *
 * @author buse
 */
public class CoveredByInsurance extends DrugTakenByPrescription{
       public CoveredByInsurance(int PurchaseFee, String name) {
        super(PurchaseFee, name);
    }

    public int calculateFee() {
        double discount = 20;
        double taxamount = 30;
           double PurchaseFee = 0;
        return (int) (PurchaseFee - (PurchaseFee * (discount / 100))+(PurchaseFee*taxamount/100));
    }
}
