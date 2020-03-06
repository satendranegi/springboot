package com.satendranegi.openshift;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("hello")
	public ResponseEntity<String> helloworld(){
		
		return new ResponseEntity<String>("hello world from openshift",HttpStatus.OK);
	}
	
	/*
	 * @RequestMapping("cloudantdblist") public String cloudantdblist() {
	 * List<String> list = new ArrayList<>(); try { list =
	 * cloudantClient.getAllDbs(); } catch (Exception e) {
	 * 
	 * return "Server Error:"+e.getMessage(); }
	 * 
	 * return
	 * "Your clouddant service is up and running fine on IBM public cloud. Toltal available databases :"
	 * +list.toString(); }
	 */
	
	
	
}
