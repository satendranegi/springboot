package com.satendranegi.openshift;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.satendranegi.openshift.model.BookingRequest;
import com.satendranegi.openshift.repository.BookingRepository;
import com.satendranegi.openshift.service.BookingServices;

import reactor.core.publisher.Mono;

@RestController
public class HelloWorld  {
	
	@Autowired
	private BookingServices bookingservices;
	
	@Autowired
	private BookingRepository bookingrequest;
	
	@RequestMapping("hello")
	public ResponseEntity<String> helloworld(){
		
		return new ResponseEntity<String>("hello world from openshift :) ",HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/createbooking",method = RequestMethod.POST)
	public String createBooking(@RequestBody BookingRequest request) {
		System.out.println("Request received for creating booking..."+request.toString());
		return bookingservices.createBooking(request);
	}
	
	@GetMapping(path = "/allbookings")
	public @ResponseBody Iterable<BookingRequest> getAllBookings(){
		System.out.println("Providing all the bookings....");
		return bookingrequest.findAll();
	}
	
	@GetMapping(path = "/removeall")
	public String removeAll() {
		
		System.out.println("deleting all the records from table");
		bookingrequest.deleteAll();
		System.out.println("deleting all the records from table==> Done");
		return "Success";
	}
	
	@GetMapping("bookings/{id}")
	public @ResponseBody Optional<BookingRequest> getBookingById(@PathVariable("id") long id){
		System.out.println("Fetching data for..."+id);
		return bookingrequest.findById(id);
		
	}
	
	
	//Reactive controller
	
	@PostMapping
	public Mono<ResponseEntity<String>> createBookingReactive(@RequestBody BookingRequest request){
		return null;
		
		//return bookingrequest.save(request);
	}
	
}
