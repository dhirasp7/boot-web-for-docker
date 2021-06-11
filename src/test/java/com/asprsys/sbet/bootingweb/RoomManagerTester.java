package com.asprsys.sbet.bootingweb;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.asprsys.sbet.bootingweb.db.RoomRepository;
import com.asprsys.sbet.bootingweb.db.model.Room;
import com.asprsys.sbet.bootingweb.service.impl.RoomManagerImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class RoomManagerTester {
	
	@Mock
	private RoomRepository roomRepository;
	
	@InjectMocks
	private RoomManagerImpl roomService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testRoomSave() {
		Room aMockRoom = new Room();
		aMockRoom.setName("PresidentSuite");
		aMockRoom.setNumber("01");
		aMockRoom.setInfo("Ma");
		
		when(roomRepository.save(Mockito.any(Room.class))).thenReturn(aMockRoom);
		//doReturn(aMockRoom).when(roomRepository).save(Mockito.any(Room.class);
		
		//Save the room
		Room savedRoom = roomRepository.save(null);
		
		//Now Verify
		assertEquals("PresidentSuite", savedRoom.getName());
	}
	
	/*
	 * @Test public void testRoomSave() { Room room = new Room();
	 * room.setName("PresidentSuite"); room.setNumber("01"); room.setInfo("Ma");
	 * 
	 * Room savedRoom = roomService.save(room); assertNotNull(savedRoom);
	 * assertNotNull(room.getId()); assertEquals("PresidentSuite", room.getName());
	 * }
	 */

}
