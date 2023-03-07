package com.mvcproject3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc3")
public class mvc_3 {


	@GetMapping("/abc3")
	public ResponseEntity<String> n2() {
		
		String st ="start mvc project";
		
		return new ResponseEntity<String> (st,HttpStatus.OK) ;
		
	}
	
	

}
