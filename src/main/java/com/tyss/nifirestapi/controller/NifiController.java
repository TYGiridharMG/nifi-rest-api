package com.tyss.nifirestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NifiController {
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void storeIOTJson(@RequestBody String json) {
		System.out.println(json);
	}
}
