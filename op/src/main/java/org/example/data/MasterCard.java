package org.example.data;

public class MasterCard extends Card{
    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    @Override
    public void payInCountry(Country country, int amount) {
        if(isCountryValidForTheseCard(country) && isBalanceGreaterzOrEqualThan(amount)){
            balance = balance - amount;
            System.out.println("Accepted");
        }
    }
    protected boolean isCountryValidForTheseCard(Country country){
        return  true;
    }
}
