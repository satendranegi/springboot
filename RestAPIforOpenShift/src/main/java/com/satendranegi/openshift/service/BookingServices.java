package com.satendranegi.openshift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.satendranegi.openshift.model.BookingRequest;
import com.satendranegi.openshift.repository.BookingRepository;

@Service
public class BookingServices {

	@Autowired
	private BookingRepository bookingrepository;
	
	@Transactional
	public String createBooking(BookingRequest request) {
		System.out.println("Creating booking...");
		String status = null;
		bookingrepository.save(request);
		
		System.out.println("Created booking succesfully...");
		return "Successfully saved";
	}
	
	
}
