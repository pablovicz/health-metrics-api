package br.com.healthmetricsapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthMetricDTO {

	private String metricName;

	private String description;

}
