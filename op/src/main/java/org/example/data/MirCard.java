package org.example.data;

public class MirCard extends Card{
    public MirCard() {
        super(PaymentSystem.MIR);
    }

    @Override
    public void payInCountry(Country country, int amount) {
        if(isCountryValidForTheseCard(country) && isBalanceGreaterzOrEqualThan(amount)){
            balance = balance - amount;
            System.out.println("Accepted");
        }
    }
    protected boolean isCountryValidForTheseCard(Country country) {
        if(country == Country.RU)
            return true;
        else
            return false;

    }
}