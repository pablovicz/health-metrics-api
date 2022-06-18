package br.com.healthmetricsapi.business;

import br.com.healthmetricsapi.dto.imc.ImcRequestDTO;
import br.com.healthmetricsapi.dto.imc.ImcResponseDTO;

public interface MetricsBusiness {

	public ImcResponseDTO getImc(ImcRequestDTO data);
	

}
