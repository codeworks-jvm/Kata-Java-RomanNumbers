package com.codeworks.kata;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static com.codeworks.kata.App.romanNumber;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {

    @Test
    public void Test_1() {
        Assert.assertEquals("I",  romanNumber(1));
    }

    @Test
    public void Test_4() {
        Assert.assertEquals("IV",  romanNumber(4));
    }

    @Test
    public void Test_10() {
        Assert.assertEquals("X",  romanNumber(10));
    }

    @Test
    public void Test_60() {
        Assert.assertEquals("LX",  romanNumber(60));
    }

    @Test
    public void Test_90() {
        Assert.assertEquals("XC",  romanNumber(90));
    }

    @Test
    public void Test_230() {
        Assert.assertEquals("CCXXX",  romanNumber(230));
    }

    @Test
    public void Test_567() {
        Assert.assertEquals("DLXVII",  romanNumber(567));
    }

    @Test
    public void Test_1345() {
        Assert.assertEquals("MCCCXLV",  romanNumber(1345));
    }

    @Test
    public void Test_3000() {
        Assert.assertEquals("MMM",  romanNumber(3000));
    }
}
