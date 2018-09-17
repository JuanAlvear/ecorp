package com.ecorprest.service;

import org.springframework.stereotype.Service;

@Service
public class CreditCardFakeCalculator implements ICreditCardFakeCalculator {
	
	private static final long  DEFAULT_VALUE = 1l;

	@Override
	public long calculateFakeNumber(int dayOfMonth) {
		return dayOfMonth * getFactorial(dayOfMonth);
	}
	
	private long getFactorial(long number) {
		long factorialResult = DEFAULT_VALUE;
		if (number > 0) {
			factorialResult = number * getFactorial(number-1l);
		}
		return factorialResult;
	}
}
