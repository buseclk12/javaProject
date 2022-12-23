/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Has_A;

import Is_A.Product;
import java.util.ArrayList;

/**
 *
 * @author buse
 */
public class Prescription {
        ArrayList<Product> drugs = new ArrayList<Product>();

    public Prescription() {
    }
        


    @Override
   public  String toString()
   {
       return drugs.toString();
               }


}
