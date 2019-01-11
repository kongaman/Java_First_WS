package com.bharath.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bharath.ws.soap.dto.PaymentProcessorRequest;
import com.bharath.ws.soap.dto.PaymentProcessorResponse;


//Implementation doesnt have to be annotated, any class that implements the interface will be exposed as a webservice
@WebService(name = "PaymentProcessor")
public interface PaymentProcessor {

	@WebMethod
	public @WebResult(name = "result") PaymentProcessorResponse processPayment(
			@WebParam(name="paymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
	//@WebMethod, @WebResult and @WebParam are optional (only to control the name in the wsdl)
}
