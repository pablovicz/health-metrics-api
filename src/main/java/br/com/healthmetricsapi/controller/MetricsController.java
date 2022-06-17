package br.com.healthmetricsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.healthmetricsapi.business.MetricsBusiness;

@CrossOrigin
@RestController
@RequestMapping("/metrics")
public class MetricsController {
	
	@Autowired
	private MetricsBusiness service;
	
	
	

}
