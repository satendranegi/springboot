package com.satendranegi.openshift.webcontroller;

import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.satendranegi.openshift.model.SiteStats;
import com.satendranegi.openshift.repository.SiteStatsRepository;

@Controller
public class WebController {

	@Autowired
	SiteStatsRepository sitestatsrepo;
	
	private HttpServletRequest request;
	
	@GetMapping("/homepage")
	public String HomePage(@RequestParam(name = "name",required = false,defaultValue = "World") String name,Model model) {
		
		model.addAttribute("name",name);
		
		return "index.html";
	}
	
	 @GetMapping("/")
	    String index(Principal principal) {
		 
		 SiteStats siteStats = new SiteStats();
		 Map<String, String> getHttpHeaders = getRequestHeadersInMap(request);
		 String clientIp = getHttpHeaders.get("x-forwarded-for");
		 //if(request!=null)
		 //siteStats.setIpAddress(request.getHeader("X-FORWARDED-FOR"));
		 siteStats.setIpAddress(clientIp);
		 System.out.println("Request ..."+siteStats.toString());
		 sitestatsrepo.save(siteStats);
		 
		 
	        return principal != null ? "index" : "index.html";
	    }
	 
	 @GetMapping("/login")
	    String login(Principal principal) {
	        return principal != null ? "index" : "login.html";
	    }
	 
	 
	 private Map<String, String> getRequestHeadersInMap(HttpServletRequest request) {

	        Map<String, String> result = new HashMap<>();

	        Enumeration headerNames = request.getHeaderNames();
	        while (headerNames.hasMoreElements()) {
	            String key = (String) headerNames.nextElement();
	            String value = request.getHeader(key);
	            result.put(key, value);
	        }

	        return result;
	    }
	 
	
}
