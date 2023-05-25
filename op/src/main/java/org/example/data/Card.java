package org.example.data;

public abstract class Card {

    protected String cardholder;
    protected int balance;
    protected String cardnumber;
    protected PaymentSystem paymentSystem;

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0)
            return;
        else {
            System.out.println("added balance:" + balance);
            this.balance = balance;
        }
    }
    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        if(cardnumber.length() != 16)
            return;
        this.cardnumber = cardnumber;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card (PaymentSystem paymentSystem){
        this.paymentSystem = paymentSystem;
    }
    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }
    protected boolean isBalanceGreaterzOrEqualThan(int amount) {
        return balance >= amount;
    }
    public abstract void payInCountry(Country country, int amount);
    protected abstract boolean isCountryValidForTheseCard(Country country);

}
