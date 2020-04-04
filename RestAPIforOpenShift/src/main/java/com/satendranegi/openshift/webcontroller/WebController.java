package com.satendranegi.openshift.webcontroller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@GetMapping("/homepage")
	public String HomePage(@RequestParam(name = "name",required = false,defaultValue = "World") String name,Model model) {
		
		model.addAttribute("name",name);
		
		return "homepage";
	}
	
	 @GetMapping("/")
	    String index(Principal principal) {
	        return principal != null ? "homepage" : "index.html";
	    }
	
}
