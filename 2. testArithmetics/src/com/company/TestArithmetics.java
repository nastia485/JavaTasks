package com.company;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;


public class TestArithmetics {


    @Test
    public void testAdd() {
        Arithmetics a = new Arithmetics();
        double res = a.add(3, 7);
        Assertions.assertEquals(res, 10.0);
    }

    @Test
    public void testDeduct() {
        Arithmetics a = new Arithmetics();
        double res = a.deduct(3, 7);
        Assertions.assertEquals(res, -4);
    }

    @Test
    public void testDiv() {
        Arithmetics a = new Arithmetics();
        /* double res = a.div(10,5);
        Assertions.assertEquals(res, 2.0); */

        try {
            a.div(10.0, 2.0);
            Assert.fail();
        } catch (Exception e) {

        }
    }

    @Test
    public void testDivException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Arithmetics a = new Arithmetics();
            a.div(10, 2);
        });

    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    public void testTimeOut() {
        Arithmetics a = new Arithmetics();
        a.div(10,10);
    }






}






