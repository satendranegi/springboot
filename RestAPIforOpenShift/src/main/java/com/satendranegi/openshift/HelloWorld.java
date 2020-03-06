package com.satendranegi.openshift;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("hello")
	public ResponseEntity<String> helloworld(){
		
		return new ResponseEntity<String>("hello world from openshift",HttpStatus.OK);
	}
}
