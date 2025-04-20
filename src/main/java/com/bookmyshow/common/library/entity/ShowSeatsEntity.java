package com.bookmyshow.common.library.entity;

import com.bookmyshow.common.library.model.Status;
import com.bookmyshow.common.library.utils.JsonTimestampSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="showseats")
public class ShowSeatsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="showseats_showseat_id_seq")
	@SequenceGenerator(name ="showseats_showseat_id_seq", sequenceName="showseats_showseat_id_seq", allocationSize=1)
	@Column(name="showseat_id")
	private Integer showseatId;
    
	@Column(name="showseat_show_id")
	private Integer showseatShowId;
	
	@ManyToOne
	@JoinColumn(name="showseat_show_id", nullable = false,insertable=false, updatable=false)
	private ShowEntity show;

	@Column(name="showseat_row")
	private String showseatRow;

	@Column(name="showseat_seatno")
	private Integer showseatSeatno;
    
	@Enumerated(EnumType.ORDINAL)
	@Column(name="showseat_status")
	private Status showseatStatus;
	
	@Column(name="showseat_ticketcost")
	private Integer showseatTicketcost;

	@JsonSerialize(using = JsonTimestampSerializer.class)
	@Column(name="showseat_createdon")
	private Timestamp showseatCreatedon;

	@JsonSerialize(using = JsonTimestampSerializer.class)
	@Column(name="showseat_updatedon")
	private Timestamp showseatUpdatedon;
}