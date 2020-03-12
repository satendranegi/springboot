package com.satendranegi.openshift.webcontroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WebController {

	@GetMapping("/homepage")
	public String HomePage(@RequestParam(name = "name",required = false,defaultValue = "World") String name,Model model) {
		
		model.addAttribute("name",name);
		
		return "homepage";
	}
	
}
