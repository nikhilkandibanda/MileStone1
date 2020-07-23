package com.wipro.bank.exception;

public class BankValidationException extends Exception{
	

	
	public String toString()
	{
		return "Invalid Data";
	}
	public BankValidationException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}


}
