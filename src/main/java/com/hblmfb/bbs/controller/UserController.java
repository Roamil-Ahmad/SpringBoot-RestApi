package com.hblmfb.bbs.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/bbs/test", method = RequestMethod.GET)
	public Map<String, String> userLogin(HttpServletRequest request) {
		try {
			
			Map<String, String> headerMap = new HashMap<String, String>();
			headerMap.put("TEST", "Done");
			return headerMap;
			
		} catch (Exception e) {
			
			return null;
		}	

	}

}
