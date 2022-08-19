package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Country;
import com.app.service.CountryServiceImpl;

@Controller
@RequestMapping("/country")
public class CountryController {
	@Autowired
	CountryServiceImpl countryService;

	@RequestMapping("/list")
	public String countryList(Model map) {
		map.addAttribute("Country_List", countryService.getCountryList());
		return "/country/list";
	}

	@RequestMapping("/sort")
	public String countrySortedList(Model map) {
		map.addAttribute("Country_List", countryService.getSortedList());
		return "/country/list";
	}

	@RequestMapping("/addCountry")
	public String addCountryForm(Country countryModel) {
		return "/country/add";
	}

	@PostMapping("/addCountry")
	public String addCountryNow(Country gotCountryDetail) {
		countryService.addCountry(gotCountryDetail);
		return "redirect:/country/list";
	}

	// http://localhost:8080/countryInfo/country/country/delete?id=1
	@GetMapping("/delete")
	public String deleteCountry(@RequestParam long id) {
		countryService.deleteCountry(id);
		return "redirect:/country/list";
	}
}
