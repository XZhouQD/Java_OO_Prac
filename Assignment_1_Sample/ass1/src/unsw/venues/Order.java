package unsw.venues;

import java.time.LocalDate;

import org.json.JSONObject;

public class Order {

	private String id; //primary key
	private String roomName; //get from aggregation room
	private String belonging; //get from aggregation room (Name of Venue)
	private LocalDate startDate; //created by request
	private LocalDate endDate; //created by request
	
	public Order(String id, String roomName, String belonging, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.roomName = roomName;
		this.belonging = belonging;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public String getRoomName() {
		return roomName;
	}

	public String getBelonging() {
		return belonging;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	public JSONObject getInfo() {
		JSONObject res = new JSONObject();
		res.put("id", id);
		res.put("start", startDate.toString()); //yyyy-mm-dd
		res.put("end", endDate.toString());
		return res;
	}

}
