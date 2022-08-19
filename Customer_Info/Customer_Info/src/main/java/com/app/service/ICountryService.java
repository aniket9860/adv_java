package com.app.service;

import java.util.List;

import com.app.pojos.Country;

public interface ICountryService {
	List<Country> getCountryList();

	List<Country> getSortedList();

	String addCountry(Country newCountryDetails);

	String deleteCountry(long id);
}
