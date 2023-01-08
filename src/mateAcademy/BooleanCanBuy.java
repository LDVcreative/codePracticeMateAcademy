package mateAcademy;

public class BooleanCanBuy {
    public static void main(String[] args) {
        int userAge = 15;
        int userBankAccountCash = 50; //The amount of cash in the user's bank account

        int ageLimit = 18; //Restrictions on the purchase of goods
        int price = 30; //Price of goods

        boolean cashCheck = userBankAccountCash >= price;
        boolean ageCheck = userAge >= ageLimit;

        if (cashCheck&&ageCheck){
            System.out.println("You can buy this product");
        } else {
            System.out.println("You can't buy this product");
        }

        //Another version of checking system:
        boolean canBuy = cashCheck&&ageCheck;
        System.out.println(canBuy);


    }
}
