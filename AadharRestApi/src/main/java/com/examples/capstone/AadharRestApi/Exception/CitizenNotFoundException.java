package com.examples.capstone.AadharRestApi.Exception;

public class CitizenNotFoundException extends RuntimeException{
	
	public CitizenNotFoundException(int id) {
		super("Citizen with id " + id + " is not Found.Pls Give another id!!");
	}

}
