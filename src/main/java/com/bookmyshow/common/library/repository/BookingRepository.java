package com.bookmyshow.common.library.repository;

import com.bookmyshow.common.library.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer>  {
//	
//	   @Modifying
//	   @Transactional
//	   @Query("INSERT INTO BookingEntity (bookingUserId, bookingShowId, bookingTotalseats, "
//	   		+ "bookingListofseats, bookingPaymentId) VALUES "
//	   		+ "(:userId,:showId,:totalSeats,:listOfSeats,:paymentId) RETURNING bookingId")
//	   Integer insertBookingAndReturnId(@Param("userId") Integer userId,@Param("showId") Integer showId,
//			   @Param("totalSeats") Integer totalSeats,
//			   @Param("listOfSeats") String listOfSeats,@Param("paymentId") Integer paymentId);
//	   
}
