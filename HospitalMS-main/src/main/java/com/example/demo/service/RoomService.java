package com.example.demo.service;

import com.example.demo.entity.Room;
import com.example.demo.repo.RoomRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepo repo;

    public RoomService(RoomRepo repo) {
        this.repo = repo;
    }

    public Room save(Room room) {
        return repo.save(room);
    }

    public List<Room> getAll() {
        return repo.findAll();
    }

    public Room getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Room update(Integer id, Room room) {
        room.setRoomId(id);
        return repo.save(room);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}