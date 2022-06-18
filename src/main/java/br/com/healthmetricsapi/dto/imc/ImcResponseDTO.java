package br.com.healthmetricsapi.dto.imc;

import java.util.HashMap;
import java.util.LinkedHashMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImcResponseDTO {

	private String metricName;
	private String description;
	private ImcRequestDTO parameters;
	private String unit;
	private double imc;
	private String result;
	private HashMap<String, String> reference;

	public ImcResponseDTO setReference() {

		HashMap<String, String> ref = new LinkedHashMap<String, String>();
		ref.put("imc < 18,5", "Magreza");
		ref.put("18,5 <= imc < 25", "Normal");
		ref.put("25 <= imc < 30", "Sobrepeso");
		ref.put("30 <= imc < 35", "Obesidade grau I");
		ref.put("35 <= imc < 40", "Obesidade grau II");
		ref.put("imc >= 40", "Obesidade grau III");

		this.reference = ref;

		return this;
	}

	public ImcResponseDTO setUnit() {

		this.unit = "kg/m²";

		return this;
	}

	public ImcResponseDTO setMetricName() {
		this.metricName = "IMC";
		return this;
	}

	public ImcResponseDTO setDescription() {
		this.description = "Índice de Massa Corporal";
		return this;
	}

	public ImcResponseDTO setResult() {

		if (this.imc < 18.5) {

			this.result = "Magreza";

		} else if (18.5 >= this.imc && this.imc < 25) {

			this.result = "Normal";

		} else if (25 >= this.imc && this.imc < 30) {

			this.result = "Sobrepeso";

		} else if (30 >= this.imc && this.imc < 35) {

			this.result = "Obesidade grau I";
		} else if (35 >= this.imc && this.imc < 40) {

			this.result = "Obesidade grau II";
		} else {
			this.result = "Obesidade grau III";
		}

		return this;
	}

}
