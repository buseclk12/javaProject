/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Has_A;

/**
 *
 * @author buse
 */
public class Customer {
    private String nameSurname;
    private int age;
    private double totalFee;
    private Prescription pres;

    public Customer(String nameSurname, int age, double totalFee,Prescription pres ) {
        
        this.nameSurname = nameSurname;
        this.age = age;
        this.totalFee = totalFee;
        this.pres = pres;
    }


    public String getNameSurname() {
        return nameSurname;
    }

    public int getAge() {
        return age;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }
    @Override
    public String toString()
    {
      return "Customer name and surname= "+nameSurname +"\n"+
              "Age= "+ age + "\n"+
              "Total Fee= "+ totalFee+"\n"
              + "Prescription" + pres.toString()+"\n";
        
        
        
        
    }
}
