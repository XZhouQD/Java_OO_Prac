/**
 *
 */
package unsw.venues;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Venue Hire System for COMP2511.
 *
 * A basic prototype to serve as the "back-end" of a venue hire system. Input
 * and output is in JSON format.
 *
 * @author Robert Clifton-Everest
 *
 */
public class VenueHireSystem {

	private ArrayList<Venue> venueList;
	private ArrayList<String> idList;
	
    /**
     * Constructs a venue hire system. Initially, the system contains no venues,
     * rooms, or bookings.
     */
    public VenueHireSystem() {
        this.venueList = new ArrayList<Venue>();
        this.idList = new ArrayList<String>();
    }

    private void processCommand(JSONObject json) {
        switch (json.getString("command")) {

        case "room":
            String venue = json.getString("venue");
            String room = json.getString("room");
            String size = json.getString("size");
            addRoom(venue, room, size);
            break;

        case "request":
            String id = json.getString("id");
            LocalDate start = LocalDate.parse(json.getString("start"));
            LocalDate end = LocalDate.parse(json.getString("end"));
            int small = json.getInt("small");
            int medium = json.getInt("medium");
            int large = json.getInt("large");

            JSONObject result = request(id, start, end, small, medium, large);

            System.out.println(result.toString(2));
            break;
            
        case "change":
        	String id1 = json.getString("id");
            LocalDate start1 = LocalDate.parse(json.getString("start"));
            LocalDate end1 = LocalDate.parse(json.getString("end"));
            int small1 = json.getInt("small");
            int medium1 = json.getInt("medium");
            int large1 = json.getInt("large");

            JSONObject result1 = change(id1, start1, end1, small1, medium1, large1);
            System.out.println(result1.toString(2));
        	break;
        	
        case "cancel":
        	String id2 = json.getString("id");
        	JSONObject result2 = cancel(id2);
        	System.out.println(result2.toString(2));
        	break;
        	
        case "list":
        	String venue1 = json.getString("venue");
        	JSONArray result3 = list(venue1);
        	System.out.println(result3.toString(2));        	
        	break;

        // TODO Implement other commands
        }
    }

    private void addRoom(String venue, String room, String size) {
        boolean venueExist = false;
        for(Venue v: venueList) {
        	if(venue.equals(v.getName())) {
        		venueExist = true;
        		v.addRoom(room, size);
        		break; //return;
        	}
        }
        if(!venueExist) {
        	Venue v = new Venue(venue);
        	v.addRoom(room, size);
        	venueList.add(v);
        }
    }

    public JSONObject request(String id, LocalDate start, LocalDate end,
            int small, int medium, int large) {
        JSONObject result = new JSONObject();

        // TODO Process the request commmand
        if(idList.contains(id)) {
        	result.put("status", "rejected");
        	return result;
        }
        
        ArrayList<Order> orderList = new ArrayList<Order>();
        
        for(Venue v: venueList) {
        	boolean venueFit = true;
        	for(int i = 0; i < small; i++) {
        		Order newOrder = v.tryBooking(id, "small", start, end);
        		if(newOrder == null) {
        			venueFit = false;
        			break;
        		} else
        			orderList.add(newOrder);
        	}
        	for(int i = 0; i < medium; i++) {
        		Order newOrder = v.tryBooking(id, "medium", start, end);
        		if(newOrder == null) {
        			venueFit = false;
        			break;
        		} else
        			orderList.add(newOrder);
        	}
        	for(int i = 0; i < large; i++) {
        		Order newOrder = v.tryBooking(id, "large", start, end);
        		if(newOrder == null) {
        			venueFit = false;
        			break;
        		} else
        			orderList.add(newOrder);
        	}
        	
        	if(venueFit) {
        		result.put("status", "success");
        		result.put("venue", v.getName());
        		JSONArray rooms = new JSONArray();
        		for (Order o : orderList) {
        			rooms.put(o.getRoomName());
        		}
        		result.put("rooms", rooms);
        		idList.add(id);
        		return result;
        	} else {
        		for(Room r: v.getRooms()) {
        			boolean release = true;
        			while(release)
        				release = (r.releaseOrder(id) != null); //True/False: r.releaseOrder(id): Order/null
        		}
        		orderList.clear();
        		venueFit = true;
        	}
        }

        result.put("status", "rejected");
    	return result;
    }

    public JSONObject change(String id, LocalDate start, LocalDate end,
            int small, int medium, int large) {
    	JSONObject result = new JSONObject();
    	if (!idList.contains(id)) {
    		result.put("status", "rejected");
    		return result;
    	}
    	
    	ArrayList<Order> original = new ArrayList<Order>();
    	for(Venue v: venueList) {
    		for(Room r : v.getRooms()) {
    			boolean release = true;
    			while(release) {
    				Order tempOrder = r.releaseOrder(id);
    				if(tempOrder != null) {
    					original.add(tempOrder);
    				} else
    					release = false;
    			}
    		}
    	}
    	idList.remove(id);
    	
    	JSONObject tempResult = this.request(id, start, end, small, medium, large);
    	if (tempResult.getString("status").equals("rejected")) {
    		for(Order o : original) {
    			for(Venue v: venueList) {
    				if(o.getBelonging().equals(v.getName())) {
    					for(Room r: v.getRooms()) {
    						if(o.getRoomName().equals(r.getName())) {
    							r.addOrder(o);
    						}
    					}
    				}
    			}
    		}
    		idList.add(id);
    	}
    	return tempResult;
    }
    
    public JSONObject cancel(String id) {
    	JSONObject result = new JSONObject();
    	if (!idList.contains(id)) {
    		result.put("status", "rejected");
    		return result;
    	}
    	for (Venue v: venueList) {
    		for(Room r : v.getRooms()) {
    			boolean release = true;
    			while(release) {
    				release = (r.releaseOrder(id) != null);
    			}
    		}
    	}
    	result.put("status", "success");
    	return result;
    }
    
    public JSONArray list(String venue) {
    	JSONArray result = new JSONArray();
    	for (Venue v : venueList) {
    		if (venue.equals(v.getName())) {
    			return v.list();
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
        VenueHireSystem system = new VenueHireSystem();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (!line.trim().equals("")) {
                JSONObject command = new JSONObject(line);
                system.processCommand(command);
            }
        }
        sc.close();
    }

}
