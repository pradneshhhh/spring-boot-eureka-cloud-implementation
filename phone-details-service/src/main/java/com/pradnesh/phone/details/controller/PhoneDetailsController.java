package com.pradnesh.phone.details.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pradnesh.phone.details.DTO.Phone;
import com.pradnesh.phone.details.service.PhoneDetailsService;

@RestController
public class PhoneDetailsController {
	
	@GetMapping(value="/getPhoneDetails/{phoneBrand}")
	public List<Phone> getPhoneDetails(@PathVariable String phoneBrand) {
		return PhoneDetailsService.getPhoneDetails(phoneBrand);
	}
}
