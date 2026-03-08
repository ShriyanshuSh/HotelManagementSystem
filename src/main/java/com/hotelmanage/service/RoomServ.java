package com.hotelmanage.service;

import java.util.List;
import com.hotelmanage.entity.Room;

public interface RoomServ {

    Room saveRoom(Room room);

    List<Room> getAllRooms();

    Room getRoomById(Long id);

    Room updateRoom(Long id, Room room);

    void deleteRoom(Long id);
}