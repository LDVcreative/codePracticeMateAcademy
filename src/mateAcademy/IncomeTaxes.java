package mateAcademy;

public class IncomeTaxes {
    public static void main(String[] args) {

        double taxes = calculateTaxes(3000);
        System.out.println(taxes);
    }
    public static double calculateTaxes(double income) {
        //Write code below this line
        if (income <= 1000){
            return income*0.02;
        } else if (income <= 10000){
            return (income*0.03);
        } else {
            return (income*0.05);
        }
        //Write code above this line
    }
}
