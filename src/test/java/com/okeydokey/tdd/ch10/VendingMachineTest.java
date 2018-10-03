package com.okeydokey.tdd.ch10;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VendingMachineTest {

    @Test
    public void 금액_투입() {
        // give
        VendingMachine vendingMachine = new VendingMachine();

        // when
        vendingMachine.putCoin(100);
        vendingMachine.putCoin(1000);

        // then
        assertThat(vendingMachine.getChargeAmount(), is(1100));

    }

    @Test
    public void 잔액_확인() {
        // give
        VendingMachine vendingMachine = new VendingMachine();

        // when
        vendingMachine.putCoin(100);
        vendingMachine.putCoin(1000);

        // then
        assertThat(vendingMachine.getChargeAmount(), is(1100));
    }

    @Test
    public void 거스름돈_투입1000_음료650() {
        // give
        VendingMachine vendingMachine = new VendingMachine();

        // when
        vendingMachine.putCoin(1000);
        vendingMachine.selectDrink(650);

        // then
        assertThat(vendingMachine.getChargeCoinSet(), equalTo(new CoinSet(0, 3, 1, 0)));
    }

    @Test
    public void 거스름돈_투입1000_음료10() {
        // give
        VendingMachine vendingMachine = new VendingMachine();

        // when
        vendingMachine.putCoin(1000);
        vendingMachine.selectDrink(10);

        // then
        assertThat(vendingMachine.getChargeCoinSet(), equalTo(new CoinSet(1, 4, 1, 4)));
    }
}