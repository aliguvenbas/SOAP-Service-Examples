package com.ag.cw.core;

public class CWCore {

	public static void main(String[] args) {
		String countryNAme = args[0];
		System.out.println("Country:"+countryNAme);
		
		CountryService service = new CountryService();
		//stub Layman's terms, it's dummy data (or fake data, test data...etc.) 
		//that you can use to test or develop your code against until you (or the other party) 
		//is ready to present/receive real data. 
		//It's a programmer's "Lorem Ipsum".
		System.out.println("ISOCODE:"+service.getCounrtyISOCode(countryNAme));
	}

}
