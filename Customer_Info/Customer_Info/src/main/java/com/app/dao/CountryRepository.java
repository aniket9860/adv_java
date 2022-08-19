package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
	@Query("select u from Country u order by u.population desc")
	List<Country> sortedCountryList();
}
