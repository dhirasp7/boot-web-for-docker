package com.asprsys.sbet.bootingweb.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asprsys.sbet.bootingweb.db.model.Employee;
import com.asprsys.sbet.bootingweb.db.model.Room;
import com.asprsys.sbet.bootingweb.service.RoomManager;

@Controller
@RequestMapping("/hotel")
public class RoomController {

	private RoomManager roomManager;
	
	public RoomController (RoomManager roomManager) {
		this.roomManager = roomManager;
	}
	
	private static final List<Room> staticRooms = new ArrayList<Room>();
	private static final List<Employee> staticEmployees = new ArrayList<Employee>();
	static {
		for(int i = 1; i < 11; i++) {
			staticRooms.add(new Room(i, "Room:"+i, "N"+i, "Info:"+i));
		}
	}	
	static {
		for(int i = 1; i < 11; i++) {
			staticEmployees.add(new Employee("EmpID"+i, "fn:"+i, "ln"+i, "pos:"+i));
		}
	}
	
	@GetMapping("/allRooms")
	public String getAllRooms(Model model) {
		model.addAttribute("rooms", roomManager.getAllRooms());
		model.addAttribute("employees", staticEmployees);
		return "landonRooms";
	}
	
	@GetMapping("/allEmployees")
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", staticEmployees);
		return "landonEmployees";
	}	
	
}
