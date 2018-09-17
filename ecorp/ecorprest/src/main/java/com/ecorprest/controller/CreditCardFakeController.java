package com.ecorprest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecorprest.service.ICreditCardFakeCalculator;

@RestController
@RequestMapping("/creditCard")
public class CreditCardFakeController {
	
	Logger logger = LoggerFactory.getLogger(CreditCardFakeController.class);
	
	@Autowired
	private ICreditCardFakeCalculator creditCardFakeCalculator;
	
	@RequestMapping(value = "/fakeCalculator/{dayOfMonth}", method = RequestMethod.GET)
	public ResponseEntity<?> calculateCreditCardFake(@RequestParam int dayOfMonth) {
		logger.info(String.format("Calculating Number of Credit Card Fake for day of the month: %d", dayOfMonth));
		ResponseEntity<?> response = null;
		try  {
			response =  new ResponseEntity<>(creditCardFakeCalculator.calculateFakeNumber(dayOfMonth), HttpStatus.OK);
		}catch (Exception e) {
			response =  new ResponseEntity<>(String.format("Error Calculating Number of Credit Card Fake for day of the month: %d", dayOfMonth) , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
}
