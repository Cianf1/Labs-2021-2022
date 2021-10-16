package ie.carlow.lab2;
// Cian Fox
//C00230409
public class Driver {

	public static void main(String[] args) {
		System.out.println("Welcome to our Hotel management system");
		
		HotelRoom roomA = new HotelRoom();
		roomA.setroomNumber(201);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(80);
		
		
		
		HotelRoom roomB = new HotelRoom();
		roomB.setroomNumber(202);
		roomB.setRoomType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		HotelRoom roomC = new HotelRoom();
		roomC.setroomNumber(202);
		roomC.setRoomType("Double");
		roomC.setOccupied(0);
		roomC.setRate(90);
		
		
		if (roomB.isOccupied() == false) {
			roomB.setOccupied(1);
		}
		if (roomB.isOccupied() == false) {
			roomB.setOccupied(1);
		}
		
		
		
		
		
		System.out.println("Information about the rooms");
		System.out.println("room A: ");
		System.out.println("Roomnumber: " + roomA.getroomNumber());
		System.out.println("Room Type: " + roomA.getRoomType());
		
		
		
		System.out.println("room B: ");
		System.out.println("Roomnumber: " + roomB.getroomNumber());
		System.out.println("Room Type: " + roomB.getRoomType());
		
		
		System.out.println("room C: ");
		System.out.println("Roomnumber: " + roomC.getroomNumber());
		System.out.println("Room Type: " + roomC.getRoomType());
		
		
		
		
	}

}
