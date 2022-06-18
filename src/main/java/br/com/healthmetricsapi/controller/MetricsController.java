package br.com.healthmetricsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.healthmetricsapi.business.MetricsBusiness;
import br.com.healthmetricsapi.dto.imc.ImcRequestDTO;
import br.com.healthmetricsapi.dto.imc.ImcResponseDTO;

@CrossOrigin
@RestController
@RequestMapping("/metrics")
public class MetricsController {
	
	@Autowired
	private MetricsBusiness service;
	
	
	@PostMapping("/imc")
	public ResponseEntity<ImcResponseDTO> getImc(@RequestBody ImcRequestDTO data){
		
		return ResponseEntity.ok(this.service.getImc(data));
	}
	
	
	

}
