/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemClasses;

import Is_A.Product;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author buse
 */
public class DrugSys {
    private static ArrayList<Product> drugs = new ArrayList<Product>();

    public static boolean addDrug(Product p) {
        for (int i = 0; i < drugs.size(); i++) {
            Product get = drugs.get(i);

            if (p.getName() == drugs.get(i).getName()) {
                return false;
            }

        }

        drugs.add(p);
        return true;
    }


     
    public static Product searchDrug(String DrugName) {
        for (int i = 0; i < drugs.size(); i++) {
            

            if (DrugName.equalsIgnoreCase(drugs.get(i).getName())) {
                return drugs.get(i);
            }

        }
        return null;
    }

    public static String display() {
        String output = "";
        for (int i = 0; i < drugs.size(); i++) {
            Product get = drugs.get(i);
            output += get.toString() + "\n";
        }
        return output;
    }

    public static boolean deleteDrug(String Drugname) {
        for (int i = 0; i < drugs.size(); i++) {
            if (drugs.get(i).getName().equalsIgnoreCase(Drugname)) {
                drugs.remove(i);
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Product> getDrugs() {
        return drugs;
    }

    public static String[] getDrugsNames() {
        int i = 0;
        String[] Drugs = new String[drugs.size()];
        for (Product c : drugs) {
            Drugs[i] = c.getName() + "";
            i++;
        }

        return Drugs;
    }
}
