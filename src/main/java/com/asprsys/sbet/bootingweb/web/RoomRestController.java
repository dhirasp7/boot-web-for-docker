package com.asprsys.sbet.bootingweb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asprsys.sbet.bootingweb.db.model.Room;
import com.asprsys.sbet.bootingweb.service.RoomManager;

@RestController
@RequestMapping("/api/rooms/")
public class RoomRestController {

	@Autowired
	private RoomManager roomManager;
	
	public RoomRestController () {
	}	
	

	@GetMapping("/allRooms")
	public List<Room> getAllRooms(Model model) {
		return roomManager.getAllRooms();
	}

}
