package ie.carlow.lab2;

public class HotelRoom {

	private int roomNumber;
	private String roomType;
	private int occupied;
	private double rate;
	
	public HotelRoom() {
	}
	public HotelRoom(int roomNumber,String roomType, int occupied, double rate ) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.occupied = occupied;
		this.rate = rate;
	}
	
	public int getroomNumber() {
	return roomNumber;
	}
	public void setroomNumber(int RoomNumber) {
    this.roomNumber = RoomNumber;
	}
	
	public String getRoomType() {
	return roomType;
	}
	public void setRoomType(String newRoomType) {
		this.roomType = newRoomType;
	}
	
	public int getOccupied() {
	return occupied;
	}
	public boolean isOccupied() {
		if(occupied == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setOccupied(int newOccupied) {
	occupied = newOccupied;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double newRate) {
		rate = newRate;
	}

}
