package unsw.venues;

import java.time.LocalDate;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Room {

	private String name;
	private String size;
	private ArrayList<Order> orders;
	private String belonging;
	public Room(String name, String size, String belonging) {
		super();
		this.name = name;
		this.size = size;
		this.belonging = belonging;
		this.orders = new ArrayList<Order>();
	}
	
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	
	public Order makeOrder(String id, LocalDate startDate, LocalDate endDate, String size) {
		boolean available = true;
		for(Order order : orders ) {
			if (startDate.isAfter(order.getEndDate()) || endDate.isBefore(order.getStartDate())) {
				available = true;
			} else {
				available = false;
				break;
			}
		}
		if(available && size.equals(this.size)) {
			Order order = new Order(id, name, belonging, startDate, endDate);
			addOrder(order);
			return order;
		}
		return null;
	}
	
	public void addOrder(Order order) {
		for (int i = 0; i < orders.size(); i++) { //find if order add at the middle of list
			if (orders.get(i).getStartDate().isBefore(order.getStartDate()))
				continue;
			else {
				orders.add(i, order);
				return;
			}
		}
		orders.add(order); //not at the middle, append at the end
	}
	
	public Order releaseOrder(String id) {
		for(Order order: orders) {
			if(id.equals(order.getId())) {
				Order toRelease = order;
				orders.remove(toRelease);
				return toRelease;
			}
		}
		return null;
	}
	
	public JSONArray getReservations() {
		JSONArray result = new JSONArray();
		for(Order o : orders) {
			result.put(o.getInfo());
		}
		return result;
	}
}
