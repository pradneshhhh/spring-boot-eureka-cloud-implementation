package com.pradnesh.phone.details.service;

import java.util.ArrayList;
import java.util.List;

import com.pradnesh.phone.details.DTO.Phone;

public class PhoneDetailsService {
	
	public static List<Phone> getPhoneDetails(String phoneBrand){
		List<Phone> phoneDetailsList = null;
		if(phoneBrand != null) {
			if(phoneBrand.equalsIgnoreCase("oneplus")) {
				phoneDetailsList = new ArrayList<Phone>();
				Phone p1 = new Phone("Oneplus 7", "30000");
				Phone p2 = new Phone("Oneplus Nord", "25000");
				phoneDetailsList.add(p1);
				phoneDetailsList.add(p2);
			}else if(phoneBrand.equalsIgnoreCase("apple")) {
				phoneDetailsList = new ArrayList<Phone>();
				Phone p1 = new Phone("iPhone XR", "60000");
				Phone p2 = new Phone("iPhone 11", "75000");
				phoneDetailsList.add(p1);
				phoneDetailsList.add(p2);
			}else {
				phoneDetailsList = new ArrayList<Phone>();
				phoneDetailsList.add(new Phone("Error!","Enter a valid Phone Brand name"));
			}
		}else {
			phoneDetailsList = new ArrayList<Phone>();
			phoneDetailsList.add(new Phone("Error!","Enter a valid Phone Brand"));
		}
		return phoneDetailsList;
	}
}
