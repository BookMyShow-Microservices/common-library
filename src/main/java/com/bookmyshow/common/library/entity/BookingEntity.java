package com.bookmyshow.common.library.entity;

import com.bookmyshow.common.library.utils.JsonTimestampSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bookings_booking_id_seq")
	@SequenceGenerator(name ="bookings_booking_id_seq", sequenceName="bookings_booking_id_seq", allocationSize=1)
	@Column(name="booking_id")
	private Integer bookingId;

	@Column(name="booking_user_id")
	private Integer bookingUserId;

	@Column(name="booking_show_id")
	private Integer bookingShowId;

	@Column(name="booking_totalseats")
	private Integer bookingTotalseats;

	@Column(name="booking_listofseats")
	private String bookingListofseats;

	@Column(name="booking_payment_id")
	private Integer bookingPaymentId;

	@JsonSerialize(using = JsonTimestampSerializer.class)
	@Column(name="booking_createdon")
	private Timestamp bookingCreatedon;

	@JsonSerialize(using = JsonTimestampSerializer.class)
	@Column(name="booking_updatedon")
	private Timestamp bookingUpdatedon;
}
