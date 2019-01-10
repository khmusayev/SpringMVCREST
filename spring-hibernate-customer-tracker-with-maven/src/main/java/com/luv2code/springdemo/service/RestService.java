package com.luv2code.springdemo.service;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.SerializationFeature;

@Service
public class RestService extends RestTemplate {

	public RestService() {
		super();
		setJasonConverter();
	}

	private void setJasonConverter() {
		MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
	    jsonHttpMessageConverter.getObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	    this.getMessageConverters().add(jsonHttpMessageConverter);
	}
	
}
