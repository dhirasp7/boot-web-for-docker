package com.asprsys.sbet.bootingweb.service;

import java.util.List;

import com.asprsys.sbet.bootingweb.db.model.Room;


public interface RoomManager {
	public List<Room> getAllRooms();

	public Room getById(long id);
	public Room save(Room room);
}
