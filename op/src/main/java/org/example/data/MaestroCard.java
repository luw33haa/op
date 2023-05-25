package org.example.data;

import static org.example.data.Country.RU;
public class MaestroCard extends Card{

    public MaestroCard() {
        super (PaymentSystem.MAESTRO);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
