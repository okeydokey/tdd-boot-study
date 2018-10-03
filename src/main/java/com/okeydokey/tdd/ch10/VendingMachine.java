package com.okeydokey.tdd.ch10;

import static com.okeydokey.tdd.ch10.CoinSet.*;

public class VendingMachine {

    private int chargeAmount;

    public VendingMachine() {
        this.chargeAmount = 0;
    }

    public void putCoin(int coin) {
        chargeAmount += coin;
    }

    public int getChargeAmount() {
        return chargeAmount;
    }

    public void selectDrink(int price) {
        chargeAmount -= price;
    }

    public CoinSet getChargeCoinSet() {

        int leftChargeAmount = chargeAmount;

        int countCoin500 = leftChargeAmount / COIN_500;
        leftChargeAmount = leftChargeAmount % COIN_500;

        int countCoin100 = leftChargeAmount / COIN_100;
        leftChargeAmount = leftChargeAmount % COIN_100;

        int countCoin50 = leftChargeAmount / COIN_50;
        leftChargeAmount = leftChargeAmount % COIN_50;

        int countCoin10 = leftChargeAmount / COIN_10;
        leftChargeAmount = leftChargeAmount % COIN_10;

        return new CoinSet(countCoin500, countCoin100, countCoin50, countCoin10);

    }
}
