package com.pradnesh.phone.brand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pradnesh.phone.brand.DTO.Phone;

@RestController
public class PhoneBrandController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping(value="/getPhoneBrand/{phoneBrand}")
	public String getPhoneBrand(@PathVariable String phoneBrand) {
//		String resp = restTemplate.exchange("http://phone-details-service//getPhoneDetails/{phoneBrand}",
//                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, phoneBrand).getBody();
		Phone phone = restTemplate.getForObject("http://phone-details-service//getPhoneDetails/" + phoneBrand , Phone.class);
		return "Brand Name: "+phoneBrand.toUpperCase()+"\nProducts: "+ phone.toString();
	}
}
