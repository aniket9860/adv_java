package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CountryRepository;
import com.app.pojos.Country;

@Service
@Transactional
public class CountryServiceImpl implements ICountryService {
	@Autowired
	CountryRepository countryRepo;

	@Override
	public List<Country> getCountryList() {
		return countryRepo.findAll();
	}

	@Override
	public List<Country> getSortedList() {
		// TODO Auto-generated method stub
		return countryRepo.sortedCountryList();
	}

	@Override
	public String addCountry(Country newCountryDetails) {
		countryRepo.save(newCountryDetails);
		return "Country Added Successfull";
	}

	@Override
	public String deleteCountry(long id) {
		countryRepo.deleteById(id);
		return "Deleted Sucessfully";
	}
	
	

}
