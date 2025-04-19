package com.bookmyshow.common.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingSummaryRequest {
	
	private List<Integer> seatsUniqueIds;
	private Integer showId;
	private Status currentSeatStatus;
	private Boolean isUpdateRequired;
	
	/**
	 * 1. status: 0 -  isUpdateRequired -  true
	 * 2.status: 2 - isUpdateRequired -  false
	 */
}
