package com.bookmyshow.common.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingSummaryResponse {
	
	private ShowDetails showDetails;
	private SeatPricingDetails seatPricingDetails;
	
}
