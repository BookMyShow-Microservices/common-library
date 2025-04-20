package com.bookmyshow.common.library.repository;

import com.bookmyshow.common.library.entity.ShowSeatsEntity;
import com.bookmyshow.common.library.model.Status;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeatsEntity, Integer> {
	

   List<ShowSeatsEntity> findByShowseatIdInAndShowseatShowId(List<Integer> seatIds, Integer showId);
   
   @Modifying
   @Transactional
   @Query("UPDATE ShowSeatsEntity s SET s.showseatStatus = :status, s.showseatUpdatedon = CURRENT_TIMESTAMP "
           + "WHERE s.showseatId IN :seatUniqueIds AND s.showseatShowId = :showId")
   void updateSeatStatus(@Param("seatUniqueIds") List<Integer> seatUniqueIds, @Param("status") Status status,
           @Param("showId") Integer showId);

   @Modifying
   @Query(value = "UPDATE showseats SET showseat_status = '0', showseat_updatedon = NOW() "
           + "WHERE showseat_status = '2' AND showseat_updatedon < NOW() - INTERVAL '10 minutes'", nativeQuery = true)
   void updateToStatusAvailable();






}