package com.ag.ns.service;

public class NumberStrService {

	public String getString(int number) {
		String numberStr = null;
		switch (number) {
		case 0:
			numberStr = "";
			break;
		case 1:
			numberStr = "one";
			break;
		case 2:
			numberStr = "two";
			break;
		case 3:
			numberStr = "three";
			break;
		case 4:
			numberStr = "four";
			break;
		case 5:
			numberStr = "five";
			break;
		case 6:
			numberStr = "six";
			break;
		case 7:
			numberStr = "seven";
			break;
		case 8:
			numberStr = "eight";
			break;
		case 9:
			numberStr = "nine";
			break;
		default:
			break;
		}
		return numberStr;
	}

}
