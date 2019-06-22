package unsw.venues;

import java.time.LocalDate;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Venue {

	private String name;
	private ArrayList<Room> rooms;

	public Venue(String name) {
		this.name = name;
		this.rooms = new ArrayList<Room>();
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void addRoom(String roomName, String size) {
		Room newRoom = new Room(roomName, size, name);
		rooms.add(newRoom);
	}
	
	public Order tryBooking(String id, String size, LocalDate startDate, LocalDate endDate) {
		if(id == null || size == null || startDate == null || endDate == null)
			return null;
		for(Room room : rooms) {
			Order temp = room.makeOrder(id, startDate, endDate, size);
			if(temp != null)
				return temp;
		}
		return null;
	}

	public void addBooking(Order order) {
		for(Room room : rooms) {
			if(room.getName() == order.getRoomName()) {
				room.addOrder(order);
				return;
			}
		}
	}
	
	public JSONArray list() {
		JSONArray result = new JSONArray(); //JSONArray result
		for(Room r: this.rooms) {
			JSONObject roomInfo = new JSONObject(); //JSONObject for each room
			roomInfo.put("room", r.getName()); //put in its roomName
			roomInfo.put("reservations", r.getReservations()); //put in reservations (JSONArray)
			result.put(roomInfo); //put whole room into JSONArray
		}
		return result; //return whole JSONArray: the result to output
	}
}