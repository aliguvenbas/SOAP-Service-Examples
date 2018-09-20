package com.ag.ns.controller;

import javax.jws.WebService;

import com.ag.ns.service.NumberStrService;

@WebService
public class NSController {

	public String getSpell(int number) {
		String numberStr = "";
		NumberStrService service = new NumberStrService();
		numberStr = service.getString(number);
		return numberStr;
	}

}
