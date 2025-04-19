package com.bookmyshow.common.library.model;

import com.bookmyshow.common.library.utils.JsonTimestampSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

	private Integer bookingId;

	private Integer bookingUserId;

	private Integer bookingShowId;

	private Integer bookingTotalseats;

	private String bookingListofseats;

	private Integer bookingPaymentId;

	@JsonSerialize(using = JsonTimestampSerializer.class)
	private Timestamp bookingCreatedon;

	@JsonSerialize(using = JsonTimestampSerializer.class)
	private Timestamp bookingUpdatedon;
}
