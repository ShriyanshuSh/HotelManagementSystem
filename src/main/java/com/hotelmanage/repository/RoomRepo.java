package com.hotelmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelmanage.entity.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {

}