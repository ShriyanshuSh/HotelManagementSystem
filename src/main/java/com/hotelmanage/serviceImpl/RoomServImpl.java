package com.hotelmanage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanage.entity.Room;
import com.hotelmanage.repository.RoomRepo;
import com.hotelmanage.service.RoomServ;

@Service
public class RoomServImpl implements RoomServ {

    @Autowired
    private RoomRepo roomRepo;

    public Room saveRoom(Room room) {
        return roomRepo.save(room);
    }

    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepo.findById(id).orElse(null);
    }

    public Room updateRoom(Long id, Room room) {
        room.setRoomId(id);
        return roomRepo.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepo.deleteById(id);
    }
}