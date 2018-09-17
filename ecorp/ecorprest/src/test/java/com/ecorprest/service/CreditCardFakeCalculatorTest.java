package com.ecorprest.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CreditCardFakeCalculatorTest {
	
	@InjectMocks
	private CreditCardFakeCalculator creditCardFakeCalculator;
	
	@Test
    public void calculateFakeNumber_forDay1() {
        assertThat(creditCardFakeCalculator.calculateFakeNumber(1), is (1l));
    }
	
	@Test
    public void calculateFakeNumber_forDay2() {
        assertThat(creditCardFakeCalculator.calculateFakeNumber(2), is (4l));
    }
	
	@Test
    public void calculateFakeNumber_forDay3() {
        assertThat(creditCardFakeCalculator.calculateFakeNumber(3), is (18l));
    }
	
	@Test
    public void calculateFakeNumber_forDay4() {
        assertThat(creditCardFakeCalculator.calculateFakeNumber(4), is (96l));
    }
	
	@Test
    public void calculateFakeNumber_forDay5() {
        assertThat(creditCardFakeCalculator.calculateFakeNumber(5), is (600l));
    }
}
