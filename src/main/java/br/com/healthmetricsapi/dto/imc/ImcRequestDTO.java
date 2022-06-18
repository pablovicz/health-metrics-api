package br.com.healthmetricsapi.dto.imc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImcRequestDTO {

	private double weight;
	private double height;
	
}
