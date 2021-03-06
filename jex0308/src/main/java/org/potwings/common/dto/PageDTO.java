package org.potwings.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO {

	@Default
	private Integer page = 1;
	@Default
	private Integer perSheet = 10;
	
	public int getSkip() {
		
		return (page-1)*perSheet;
		
	}
	
}
