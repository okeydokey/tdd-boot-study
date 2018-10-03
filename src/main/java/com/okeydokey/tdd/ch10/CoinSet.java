package com.okeydokey.tdd.ch10;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class CoinSet {
    public static final int COIN_500 = 500;
    public static final int COIN_100 = 100;
    public static final int COIN_50 = 50;
    public static final int COIN_10 = 10;

    private int countCoin500;
    private int countCoin100;
    private int countCoin50;
    private int countCoin10;

    public CoinSet(int countCoin500, int countCoin100, int countCoin50, int countCoin10) {
        this.countCoin500 = countCoin500;
        this.countCoin100 = countCoin100;
        this.countCoin50 = countCoin50;
        this.countCoin10 = countCoin10;
    }
}
