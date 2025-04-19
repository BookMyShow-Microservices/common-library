package com.bookmyshow.common.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatPricingDetails {
	
	private HashMap<String, Integer> selectedSeats;
	private Integer totalSeats;
	private Integer seatsPrize;
	private float convenienceFees;
	private float subTotalPrize;
}