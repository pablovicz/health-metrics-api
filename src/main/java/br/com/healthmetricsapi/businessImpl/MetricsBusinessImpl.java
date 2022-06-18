package br.com.healthmetricsapi.businessImpl;

import org.springframework.stereotype.Service;

import br.com.healthmetricsapi.business.MetricsBusiness;
import br.com.healthmetricsapi.dto.imc.ImcRequestDTO;
import br.com.healthmetricsapi.dto.imc.ImcResponseDTO;

@Service
public class MetricsBusinessImpl implements MetricsBusiness {

	@Override
	public ImcResponseDTO getImc(ImcRequestDTO data) {

		Double imc = data.getWeight() / Math.pow(data.getHeight(), 2);

		ImcResponseDTO result = ImcResponseDTO.builder().parameters(data).imc(imc).build();
		result.setMetricName().setDescription().setUnit().setReference().setResult();

		return result;
	}

}
