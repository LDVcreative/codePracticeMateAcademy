package mateAcademy;

public class BooleanCanBuy {
    public static void main(String[] args) {
        int userAge = 19;
        int userBankAccountMoney = 8; //The amount of cash in the user's bank account
        int userWalletCash = 10;

        int ageLimit = 18; //Restrictions on the purchase of goods
        int price = 30; //Price of goods

        boolean ageCheck = userAge >= ageLimit;
        boolean userBankMoneyCheck = userBankAccountMoney >= price;
        boolean userWalletMoneyCheck = userWalletCash >= price;

        if ((userBankMoneyCheck || userWalletMoneyCheck) && ageCheck){
            System.out.println("You can buy this product");
        } else {
            System.out.println("You can't buy this product");
        }

        //Another version of checking system:
        boolean canBuy = (userBankMoneyCheck || userWalletMoneyCheck) && ageCheck;
        System.out.println(canBuy);
    }
}
