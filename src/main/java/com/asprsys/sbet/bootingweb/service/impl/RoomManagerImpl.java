package com.asprsys.sbet.bootingweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.asprsys.sbet.bootingweb.db.RoomRepository;
import com.asprsys.sbet.bootingweb.db.model.Room;
import com.asprsys.sbet.bootingweb.service.RoomManager;

@Profile({"development", "docker-demo"})
@Service
public class RoomManagerImpl implements RoomManager {
	
	@Autowired
	private RoomRepository roomRepository;
	
	
	private static final List<Room> staticRooms = new ArrayList<Room>();
	static {
		for(int i = 1; i < 11; i++) {
			staticRooms.add(new Room(i, "Room:"+i, "NN"+i, "Infor:"+i));
		}
	}	
	@Override
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}
	@Override
	public Room getById(long id) {
		return roomRepository.findById(id).get(); //since findById() is optional value we make a call to get()
	}
	@Override
	public Room save(Room room) {
		Room savedRoom = roomRepository.save(room);
		return savedRoom;
	}

}
