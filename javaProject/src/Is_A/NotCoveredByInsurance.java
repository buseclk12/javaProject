/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Is_A;

/**
 *
 * @author buse
 */
public class NotCoveredByInsurance  extends DrugTakenByPrescription{
        public NotCoveredByInsurance(int PurchaseFee, String name) {
        super(PurchaseFee, name);
    }
   public int calculateFee() {
        
        double taxamount = 30;
        return (int) (PurchaseFee +(PurchaseFee*taxamount/100));
    }

}
