package com.satendranegi.openshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.satendranegi.openshift.model.BookingRequest;
import com.satendranegi.openshift.repository.BookingRepository;
import com.satendranegi.openshift.service.BookingServices;

@RestController
public class HelloWorld {
	
	@Autowired
	private BookingServices bookingservices;
	
	@RequestMapping("hello")
	public ResponseEntity<String> helloworld(){
		
		return new ResponseEntity<String>("hello world from openshift :) ",HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/createbooking",method = RequestMethod.POST)
	public String createBooking(@RequestBody BookingRequest request) {
		System.out.println("Request received for creating booking..."+request.toString());
		return bookingservices.createBooking(request);
	}
	
	
	
	
	
	
}
