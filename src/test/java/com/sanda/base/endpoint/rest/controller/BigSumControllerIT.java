package com.sanda.base.endpoint.rest.controller;

import com.sanda.base.conf.FacadeIT;
import com.sanda.base.endpoint.rest.controller.health.BigSumController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

public class BigSumControllerIT extends FacadeIT {
    @Autowired BigSumController subject;

    @Test
    void can_do_sum_of_big_integer() {
        BigInteger a = BigInteger.valueOf(1000);
        BigInteger b = BigInteger.TWO;

        BigInteger actual = subject.add(a, b);
        BigInteger expected = BigInteger.valueOf(1002);

        Assert.assertEquals(expected, actual);
    }
}