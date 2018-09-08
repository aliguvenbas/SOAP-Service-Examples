package com.ag.cw.core;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class CountryService {

	public String getCounrtyISOCode(String countryNAme) {
		CountryInfoService countryInfoService = new CountryInfoService();
		CountryInfoServiceSoapType serviceSoapType =  countryInfoService.getCountryInfoServiceSoap();
		String ISOCode = serviceSoapType.countryISOCode(countryNAme);
		return ISOCode;
	}

}
