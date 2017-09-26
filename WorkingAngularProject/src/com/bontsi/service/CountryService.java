package com.bontsi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bontsi.bean.Country;

public class CountryService {
	
	
	static HashMap<Integer, Country> countryMap = getCountryMap();
public CountryService() {
super();
if(countryMap == null){
	countryMap=new HashMap<Integer,Country>();
	  // Creating some objects of Country while initializing
	   Country indiaCountry=new Country(1, "India",10000);
	   Country chinaCountry=new Country(4, "China",20000);
	   Country nepalCountry=new Country(3, "Nepal",8000);
	   Country bhutanCountry=new Country(2, "Bhutan",7000);
	 
	 
	   countryMap.put(1,indiaCountry);
	   countryMap.put(4,chinaCountry);
	   countryMap.put(3,nepalCountry);
	   countryMap.put(2,bhutanCountry);
}
}
	public List<Country> getAllCountries() {
		List<Country> countries = new ArrayList<Country>(countryMap.values());
		  return countries;
	}

	public Country getCountry(int id) {
		 Country country= countryMap.get(id);
		  return country;
	}

	public Country addCountry(Country country) {
		 country.setId(countryMap.size()+1);
		  countryMap.put(country.getId(), country);
		  return country;
	}

	public Country updateCountry(Country country) {
		if(country.getId()<=0)
			   return null;
			  countryMap.put(country.getId(), country);
			  return country;
	}

	public void deleteCountry(int id) {
		// TODO Auto-generated method stub
		countryMap.remove(id);
	}
	
	 public static HashMap<Integer, Country> getCountryMap() {
		  return countryMap;
		 }

}
