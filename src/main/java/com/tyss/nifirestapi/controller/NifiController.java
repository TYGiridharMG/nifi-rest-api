package com.tyss.nifirestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.nifirestapi.dto.NifiBean;
import com.tyss.nifirestapi.service.NifiService;

@RestController
public class NifiController {
	@Autowired
	private NifiService nifiService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void storeIOTJson(@RequestBody String json) {
		System.out.println(json);
		nifiService.putData(new NifiBean(json));
	}
	
	@GetMapping
	public List<NifiBean> getAllIOTJson() {
		return nifiService.getAllData();
	}
	
	@GetMapping("{id}")
	public NifiBean getIOTJson(@PathVariable int id) {
		return nifiService.getData(id);
	}
}
